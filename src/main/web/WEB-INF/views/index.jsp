<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebGL</title>
    <% String path = request.getContextPath(); %>
    <link rel="stylesheet" href="<%=path%>/static/layui/css/layui.css">
    <link rel="stylesheet" href="<%=path%>/static/css/ShadowEditor.css">
</head>
<body>
<script type="text/javascript">
    var temp = '<%= path%>'
</script>
<!--导入 所需 js-->
<script src="<%=path%>/static/js/three.js"></script>
<script src="<%=path%>/static/js/JQuery3.6.0.js"></script>
<script src="<%=path%>/static/js/controls/OrbitControls.js"></script>
<script src="<%=path%>/static/js/Loaders/OBJLoader.js"></script>
<script src="<%=path%>/static/js/Loaders/DDSLoader.js"></script>
<script src="<%=path%>/static/js/Loaders/MTLLoader.js"></script>
<script src="<%=path%>/static/js/controls/TrackballControls.js"></script>
<script src="<%=path%>/static/js/controls/DragControls.js"></script>
<script src="<%=path%>/static/js/Detector.js"></script>
<script src="<%=path%>/static/js/libs/stats.min.js"></script>
<script src="<%=path%>/static/js/libs/dat.gui.min.js"></script>
<%--<script src="<%=path%>/static/js/box.js"></script>--%>
<script src="<%=path%>/static/js/MTL.js"></script>
<script src="<%=path%>/static/js/box2.js"></script>


<div class="layui-layout layui-layout-admin">
    <!--  头部导航栏   -->
    <div class="layui-header">
        <div class="layui-logo">模型渲染展示</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="modelLoad">模型加载</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="cameraLoad">相机加载</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="shading">渲染展示</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="loadConfig">导出配置</button>
            </li>   <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="reloadConfig">场景加载</button>
            </li>
        </ul>
    </div>

    <!--  左侧属性导航栏  -->
    <div class="layui-side layui-bg-gray">
        <div class="layui-side-scroll">
            <div id="test1">树形组件</div>

            <%-- 属性组件  --%>
            <div class="VBoxLayout EditorSideBar">
                <div class="TabLayout bottom">
                    <div class="tabs">
                        <div class="tab selected" tbindex="0">属性</div>
                    </div>

                    <%--  默认属性信息隐藏  --%>
                    <div class="contents" style="display: none" id="config">
                        <div class="content show">
                            <div class="PropertyGrid">
                                <div class="PropertyGroup">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">基本信息</div>
                                    </div>
                                    <div class="content" style="height: 68px;">
                                        <div class="property TextProperty">
                                            <div class="label">名称</div>
                                            <div class="field">
                                                <input id="name" class="Input input" type="text" autocomplete="off"
                                                       value="环境光"></div>
                                        </div>
                                        <div class="property DisplayProperty">
                                            <div class="label">类型</div>
                                            <div class="field">
                                                <div class="wrap">
                                                    <div class="label" id="type">AmbientLight</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="PropertyGroup">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">位置组件</div>
                                    </div>
                                    <div class="content" style="height: 89px;">
                                        <div class="property NumberProperty">
                                            <div class="label">位置X</div>
                                            <div class="field"><input id="posX" class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">位置Y</div>
                                            <div class="field"><input id="posY" class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">位置Z</div>
                                            <div class="field"><input id="posZ" class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                    </div>
                                </div>

                                <%--   默认隐藏   --%>
                                <div class="PropertyGroup" id="light" style="display: none">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">光源组件</div>
                                    </div>
                                    <div class="content" style="height: 42px;">
                                        <div class="property ColorProperty">
                                            <div class="label">颜色</div>
                                            <div class="field"><input id="color" class="Input input" type="color"
                                                                      autocomplete="off" value="#ffffff"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">强度</div>
                                            <div class="field"><input id="intensity" class="Input input" type="number"
                                                                      autocomplete="off" value="0.24"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--  居中内容主题区域  -->
    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">绘制预览区域</div>
        <!-- 渲染区 -->
        <div class="layui-fluid">
            <div class="layui-row layui-col-space10">
                <%--   全局视角    --%>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">全局视角</div>
                        <div id="display" style="width: 800px; height:580px"
                             class="layui-card-body border:1px solid #F00">
                            <div id="display1"></div>
                        </div>
                    </div>
                </div>
                <%-- 相机渲染展示 --%>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">单相机视角</div>
                        <div style="width: 800px; height:580px" class="layui-card-body border:1px solid #F00">
                            <div id="display2"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    <!-- 页面加载完成后 进行渲染展示  -->
    window.onload = function () {
        //draw();
        //start();
        draw2();
    }
</script>
<script src="<%=path%>/static/layui/layui.js"></script>
<script>
    layui.use(['upload', 'element', 'layer', 'form', 'tree'], function () {
        var $ = layui.jquery,
            layer = layui.layer,
            element = layui.element,
            upload = layui.upload,
            tree = layui.tree,
            form = layui.form;

        // 弹出层显示
        $("#modelLoad").click(function () {
            layer.open({
                type: 2,
                area: ['520px', '400px'],
                title: '模型加载',
                content: '<%=path%>/page/getModelAdd',
                maxmin: 'true',
                end: function () {
                    location.reload();
                }
            });
        });

        //  camera load
        $("#cameraLoad").click(function () {
            layer.open({
                type: 2,
                area: ['520px', '400px'],
                title: '相机加载',
                content: '<%=path%>/page/getCameraAdd',
                maxmin: 'true',
                end: function () {
                    location.reload();
                }
            })
        });
        
        /**
         * tree mode id
         * scene  1
         * model  101
         * camera 201
         * light  301
         */

        var models;
        models = ${models};
        if(modelFilePath != null){
            // 模型记载渲染
            $("#display1").empty();
            start(models);
        }
        // 场景的默认显示：
        var int = tree.render({
            elem: "#test1",
            spread: true,
            data:${treeData},
            <%--  场景配置点击事件处理 （模型文件路径，属性列表参数设计） --%>
            click: function (obj) {
                /**
                 * 树形结构 数据点击进行 属性面板数据解析
                 */
                // 点击数据显示
                debugger;
                alert(obj.data.id + obj.data.title);
                if (obj.data.id >= 101 && obj.data.id < 201) {
                    // model
                    var modelId = obj.data.id;
                    $.ajax({
                        url: '<%=path%>/Model/GetModelById',
                        data: {modelId: modelId},
                        type: "post",
                        success: function (result) {
                            attributeResolution("model", result.extend.model);
                        }
                    });
                } else if(obj.data.id >= 201 && obj.data.id < 301){
                    // camera
                    var cameraId = obj.data.id;
                    $.ajax({
                        url:'<%=path%>/Camera/GetCameraById',
                        data:{cameraId: cameraId},
                        type:"post",
                        success: function(result){
                            attributeResolution("camera", result.extend.camera);
                        }
                    })
                } else {
                    // light
                    var lightId = obj.data.id;
                    $.ajax({
                        url:"<%=path%>/Light/GetLightById",
                        data:{lightId: lightId},
                        type:"POST",
                        success: function (result){
                            attributeResolution("light", result.extend.light);
                        }
                    })
                }

                /**
                 *  点击进行 模型记载显示，应在页面初始化过程处理
                 */
                <%--// 进行单模型加载 [默认 modelId [101-201)]--%>
                <%--if(obj.data.id > 101 && obj.data.id < 201){--%>
                <%--    var modelId = obj.data.id;--%>
                <%--    // 进行 model 查询 - 进行渲染操作--%>
                <%--    $.ajax({--%>
                <%--        url:'<%=path%>/Model/GetModelById',--%>
                <%--        data: {modelId:modelId},--%>
                <%--        type: "POST",--%>
                <%--        success: function (result) {--%>
                <%--            debugger;--%>
                <%--            console.log(result);--%>
                <%--            modelFilePath = result.extend.model.modelFilepath;--%>
                <%--            model = result.extend.model;--%>
                <%--            $("#display1").empty();--%>
                <%--            //$("#display1").html("");--%>
                <%--            // start(modelFilePath);--%>
                <%--            start(model);--%>
                <%--        }--%>
                <%--    })--%>
                <%--}--%>
                <%--// get all models by sceneID--%>
                <%--if(obj.data.id == 101){--%>
                <%--    $.ajax({--%>
                <%--        url:'<%=path%>/Model/GetAllModels',--%>
                <%--        type: "POST",--%>
                <%--        success: function (result) {--%>
                <%--            debugger;--%>
                <%--            console.log(result);--%>
                <%--            models = result.extend.models;--%>
                <%--            console.log(models.length);--%>
                <%--            --%>
                <%--            $("#display1").empty();--%>
                <%--            //$("#display1").html("");--%>
                <%--            // start(modelFilePath);--%>
                <%--            start(models);--%>
                <%--        }--%>
                <%--    })--%>
                <%--}--%>
            }
        });

        // 属性面板解析
        function attributeResolution(type, data) {
            debugger;
            if (type == 'model') {
                $("#config").css('display', 'block');
                $("#name").val(data.modelTitle);
                if (data.modelTypeId == 1) {
                    $("#type").empty().html("OBJ");
                } else if (data.modelTypeId == 2) {
                    $("#type").empty().html("PLY");
                } else {
                    $("#type").empty().html("其他");
                }
                $("#posX").val(data.modelPositionX);
                $("#posY").val(data.modelPositionY);
                $("#posZ").val(data.modelPositionZ);
            }else if(type == "camera"){
                $("#config").css('display', 'block');
                $("#name").val(data.cameraTitle);
                $("#type").empty().html(data.cameraType);
               
                $("#posX").val(data.cameraPositionX);
                $("#posY").val(data.cameraPositionY);
                $("#posZ").val(data.cameraPositionZ);
            } else {
                $("#config").css('display', 'block');
                $("#name").val(data.lightTitle);
                $("#type").empty().html(data.lightType);

                $("#posX").val(data.lightPositionX);
                $("#posY").val(data.lightPositionY);
                $("#posZ").val(data.lightPositionZ);
                
                $("#light").css('display', 'block');
                $("#color").val(data.lightColor);
                $("#intensity").val(data.lightIntensity);
            }
        }
    });
</script>
</script>
</body>
</html>
