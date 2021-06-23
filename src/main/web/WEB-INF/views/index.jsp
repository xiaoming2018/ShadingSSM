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
    var temp = '<%= path%>';
    
    // box2 中路径导入
</script>
<!--导入 所需 js-->
<script src="<%=path%>/static/js/three.js"></script>
<script src="<%=path%>/static/js/JQuery3.6.0.js"></script>
<script src="<%=path%>/static/js/controls/OrbitControls.js"></script>
<script src="<%=path%>/static/js/controls/TrackballControls.js"></script>
<script src="<%=path%>/static/js/controls/DragControls.js"></script>
<script src="<%=path%>/static/js/controls/FirstPersonControls.js"></script>
<script src="<%=path%>/static/js/controls/TransformControls.js"></script>

<script src="<%=path%>/static/js/postprocessing/EffectComposer.js"></script>
<script src="<%=path%>/static/js/postprocessing/RenderPass.js"></script>
<script src="<%=path%>/static/js/postprocessing/OutlinePass.js"></script>
<script src="<%=path%>/static/js/postprocessing/ShaderPass.js"></script>

<script src="<%=path%>/static/js/shader/FXAAShader.js"></script>
<script src="<%=path%>/static/js/shader/CopyShader.js"></script>
<script src="<%=path%>/static/js/ThreeBSP.js"></script>
<script src="<%=path%>/static/js/ThreeJS_Composer.js"></script>

<script src="<%=path%>/static/js/Loaders/OBJLoader.js"></script>
<script src="<%=path%>/static/js/Loaders/DDSLoader.js"></script>
<script src="<%=path%>/static/js/Loaders/MTLLoader.js"></script>
<script src="<%=path%>/static/js/Detector.js"></script>
<script src="<%=path%>/static/js/libs/stats.min.js"></script>
<script src="<%=path%>/static/js/libs/dat.gui.min.js"></script>
<%--<script src="<%=path%>/static/js/box.js"></script>--%>

<script src="<%=path%>/static/js/MTL.js"></script>
<script src="<%=path%>/static/js/box2.js"></script>


<div class="layui-layout layui-layout-admin">
    <!--  头部导航栏   -->
    <div class="layui-header">
        <div class="layui-logo">Model Renderding</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="modelLoad">Model Loading</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="lightAdd">Light Loading</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="cameraLoad">Camera Loading</button>
            </li>

            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="shading">Renderding</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="reloadConfig">scene Loading</button>
            </li>
            <li class="layui-nav-item">
                <button type="button" class="layui-btn" id="ImageFusion">Image Fusion</button>
            </li>
            <li class="layui-nav-item">
                <a href="<%=path%>/files/downFile">Configuare Download</a>
            </li>
        </ul>
    </div>

    <!--  左侧属性导航栏  -->
    <div class="layui-side layui-bg-gray">
        <div class="layui-side-scroll">
            <div id="test1"></div>

            <%-- 属性组件  --%>
            <div class="VBoxLayout EditorSideBar">
                <div class="TabLayout bottom">
                    <div class="tabs">
                        <div class="tab selected" tbindex="0">attributes</div>
                    </div>

                    <%--  默认属性信息隐藏  --%>
                    <div class="contents" style="display: none" id="config">
                        <div class="content show">
                            <div class="PropertyGrid">
                                <div class="PropertyGroup">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">Basic Information</div>
                                    </div>
                                    <div class="content" style="height: 68px;">
                                        <div class="property TextProperty">
                                            <div class="label">Name</div>
                                            <div class="field">
                                                <input id="name" class="Input input" type="text" autocomplete="off"
                                                       value="AmbientLight" readonly="readonly"></div>
                                        </div>
                                        <div class="property DisplayProperty">
                                            <div class="label">Type</div>
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
                                        <div class="title">Position Component</div>
                                    </div>
                                    <div class="content" style="height: 89px;">
                                        <div class="property NumberProperty">
                                            <div class="label">Position X</div>
                                            <div class="field"><input id="posX" class="Input input" type="number"
                                                                      autocomplete="off" value="0" readonly="readonly">
                                            </div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">Position Y</div>
                                            <div class="field"><input id="posY" class="Input input" type="number"
                                                                      autocomplete="off" value="0" readonly="readonly">
                                            </div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">Position Z</div>
                                            <div class="field"><input id="posZ" class="Input input" type="number"
                                                                      autocomplete="off" value="0" readonly="readonly">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <%--   默认隐藏   --%>
                                <div class="PropertyGroup" id="light" style="display: none">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">Light Component</div>
                                    </div>
                                    <div class="content" style="height: 42px;">
                                        <div class="property ColorProperty">
                                            <div class="label">Color</div>
                                            <div class="field"><input id="color" class="Input input" type="color"
                                                                      autocomplete="off" value="#ffffff"
                                                                      readonly="readonly"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">Intensity</div>
                                            <div class="field"><input id="intensity" class="Input input" type="number"
                                                                      autocomplete="off" value="0.24"
                                                                      readonly="readonly"></div>
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
        <div style="padding: 15px;">Render Preview Area</div>
        <!-- 渲染区 -->
        <div class="layui-fluid">
            <div class="layui-row layui-col-space10">
                <%--   全局视角    --%>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">User Rendering</div>
                        <div id="display" style="width: 800px; height:580px"
                             class="layui-card-body border:1px solid #F00">
                            <div id="display1"></div>
                        </div>
                    </div>
                </div>
                <%-- 相机渲染展示 --%>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">Camera Rendering</div>
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
        var models = new Array();
        var cameras = new Array();
        var lights = new Array();
        var initCamera = new Array();
        
        
        debugger; // 数据获取
        models = ${models};
        cameras = ${cameras};
        lights = ${lights}; 
        initCamera = ${initcam};
        
        start(initCamera, models[0], cameras[0], lights[0]);
        
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
                title: 'Model Loading',
                content: '<%=path%>/page/getModelAdd',
                maxmin: 'true',
                end: function () {
                    location.reload();
                }
            });
        });

        // camera load
        $("#cameraLoad").click(function () {
            layer.open({
                type: 2,
                area: ['520px', '400px'],
                title: 'Camera Loading',
                content: '<%=path%>/page/getCameraAdd',
                maxmin: 'true',
                end: function () {
                    location.reload();
                }
            })
        });

        // light add
        $("#lightAdd").click(function () {
            layer.open({
                type: 2,
                area: ['520px', '600px'],
                title: 'Light Loading',
                content: '<%=path%>/page/getLightAdd',
                maxmin: 'true',
                end: function () {
                    location.reload();
                }
            })
        })

        // loadConfig 配置导出
        $("#loadConfig").click(function () {
            $.ajax({
                url: "<%=path%>/files/downFile",
                type: "GET"
            })
        });
        
        // camera shading
        $("#shading").click(function (){
            layer.msg("camera shading");
        })

        /**
         * tree mode id
         * scene  1
         * model  101
         * camera 201
         * light  301
         */
            // 场景的默认显示：
        var int = tree.render({
                elem: "#test1",
                spread: true,
                edit: ['add', 'update', 'del'],
                data:${treeData},
                <%--  场景配置点击事件处理 （模型文件路径，属性列表参数设计） --%>
                click: function (obj) {
                    /**
                     * 树形结构 数据点击进行 属性面板数据解析
                     */
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
                    } else if (obj.data.id >= 201 && obj.data.id < 301) {
                        // camera
                        var cameraId = obj.data.id;
                        $.ajax({
                            url: '<%=path%>/Camera/GetCameraById',
                            data: {cameraId: cameraId},
                            type: "post",
                            success: function (result) {
                                attributeResolution("camera", result.extend.camera);
                            }
                        })
                    } else {
                        // light
                        var lightId = obj.data.id;
                        $.ajax({
                            url: "<%=path%>/Light/GetLightById",
                            data: {lightId: lightId},
                            type: "POST",
                            success: function (result) {
                                attributeResolution("light", result.extend.light);
                            }
                        })
                    }
                },
                customOperate: true, // 自定义属性
                operate: function (obj) { // 节点操作 回调
                    debugger;

                    var type = obj.type; // 得到操作类型 add edit del
                    var data = obj.data; // 当前节点的数据
                    var elem = obj.elem; // 得到当前节点元素

                    // ajax 操作
                    var id = data.id;
                    console.log(data);
                    if (type == 'add') { //增加节点
                        //返回 key 值
                        if (id >= 101 && id < 201) { // 模型
                            layer.open({
                                type: 2,
                                area: ['520px', '400px'],
                                title: 'Model Loading',
                                content: '<%=path%>/page/getModelAdd',
                                maxmin: true,
                                end: function () {
                                    location.reload();
                                }
                            })
                        } else if (id >= 201 && id < 301) {
                            layer.open({
                                type: 2,
                                area: ['520px', '400px'],
                                title: 'Camera Loading',
                                content: '<%=path%>/page/getCameraAdd',
                                maxmin: 'true',
                                end: function () {
                                    location.reload();
                                }
                            })
                        } else if (id >= 301 && id < 401) {
                            layer.open({
                                type: 2,
                                area: ['520px', '600px'],
                                title: 'Light Loading',
                                content: '<%=path%>/page/getLightAdd',
                                maxmin: 'true',
                                end: function () {
                                    location.reload();
                                }
                            })
                        } else {
                            layer.msg("Please select the secondary menu!");
                        }
                    } else if (type == 'update') { //修改节点
                        if (id >= 101 && id < 201) { // 模型
                            layer.open({
                                type: 2,
                                area: ['520px', '400px'],
                                title: 'Model Loading',
                                content: '<%=path%>/page/getModelEdit?modelId=' + id,
                                maxmin: true,
                                end: function () {
                                    location.reload();
                                }
                            })
                        } else if (id >= 201 && id < 301) {
                            layer.open({
                                type: 2,
                                area: ['520px', '400px'],
                                title: 'Camera Loading',
                                content: '<%=path%>/page/getCameraEdit?cameraId=' + id,
                                maxmin: 'true',
                                end: function () {
                                    location.reload();
                                }
                            })
                        } else if (id >= 301 && id < 401) {
                            layer.open({
                                type: 2,
                                area: ['520px', '600px'],
                                title: 'Light Loading',
                                content: '<%=path%>/page/getLightEdit?lightId=' + id,
                                maxmin: 'true',
                                end: function () {
                                    location.reload();
                                }
                            })
                        } else {
                            layer.msg("Please select the secondary menu!");
                        }
                        console.log(elem.find('.layui-tree-txt').html()); //得到修改后的内容
                    } else if (type == 'del') {  // 删除节点

                        var url = "";
                        if (id >= 101 && id < 201) { // 模型
                            url = "<%=path%>/Model/DeleteModel?modelId=" + id;
                        } else if (id >= 201 && id < 301) {
                            url = "<%=path%>/Camera/DeleteCamera?cameraId=" + id;
                        } else if (id >= 301 && id < 401) {
                            url = "<%=path%>/Light/DeleteLight?lightId=" + id;
                        } else {
                            layer.msg("Please select the secondary menu!");
                            return;
                        }
                        layer.confirm("Are you sure to delete " + data.title + "?", {
                            btn: ['Confirm', 'Cancel'],
                            yes: function (index) {
                                $.ajax({
                                    url: url,
                                    async: false,
                                    success: function (result) {
                                        if (result.code == 100) {
                                            layer.msg("delete success");
                                            parent.layer.close(index);
                                            location.reload();
                                        } else {
                                            layer.msg("delete failed" + result.extend.message);
                                        }
                                    },
                                    error: function () {
                                        layer.msg("delete request failed");
                                    }
                                })
                            },
                            btn2: function (index) {
                                parent.layer.close(index);
                            }
                        });
                    }
                    ;
                }
            });

        // 属性面板解析
        function attributeResolution(type, data) {
            debugger;
            if (type == 'model') {
                $("#config").css('display', 'block');
                $("#name").val(data.modelTitle);
                if (data.modelTypeId == 401) {
                    $("#type").empty().html("OBJ");
                } else if (data.modelTypeId == 402) {
                    $("#type").empty().html("PLY");
                } else {
                    $("#type").empty().html("Other");
                }
                $("#posX").val(data.modelPositionX);
                $("#posY").val(data.modelPositionY);
                $("#posZ").val(data.modelPositionZ);
            } else if (type == "camera") {
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
