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
<script type="text/javascript" >
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
        <div class="layui-logo">layout demo</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><button type="button" class="layui-btn" id="modelLoad">模型加载</button></li>
            <li class="layui-nav-item"><button type="button" class="layui-btn" id="upload">文件上传</button></li>
            <li class="layui-nav-item"><a href="">nav 2</a></li>
            <li class="layui-nav-item"><a href="">nav 3</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">nav groups</a>
                <dl class="layui-nav-child">
                    <dd><a href="">menu 11</a></dd>
                    <dd><a href="">menu 22</a></dd>
                    <dd><a href="">menu 33</a></dd>
                </dl>
            </li>
        </ul>
    </div>

    <!--  左侧属性导航栏  -->
    <div class="layui-side layui-bg-gray">
        <div class="layui-side-scroll">
            <div id="test1">树形组件</div>
            <div class="VBoxLayout EditorSideBar">
                <div class="TabLayout bottom">
                    <div class="tabs">
                        <div class="tab selected" tbindex="0">属性</div>
                    </div>
                    <div class="contents">
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
                                            <div class="field"><input class="Input input" type="text" autocomplete="off" value="环境光"></div>
                                        </div>
                                        <div class="property DisplayProperty">
                                            <div class="label">类型</div>
                                            <div class="field"><div class="wrap"><div class="label">AmbientLight</div></div></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="PropertyGroup">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">位移组件</div>
                                    </div>
                                    <div class="content" style="height: 215px;">
                                        <div class="property NumberProperty">
                                            <div class="label">平移X</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">平移Y</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">平移Z</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">旋转X</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">旋转Y</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">旋转Z</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">缩放X</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="1"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">缩放Y</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="1"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">缩放Z</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="1"></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="PropertyGroup">
                                    <div class="head" expanded="true">
                                        <div class="icon"><i class="icon-expand"></i></div>
                                        <div class="title">光源组件</div>
                                    </div>
                                    <div class="content" style="height: 42px;">
                                        <div class="property ColorProperty">
                                            <div class="label">颜色</div>
                                            <div class="field"><input class="Input input" type="color"
                                                                      autocomplete="off" value="#ffffff"></div>
                                        </div>
                                        <div class="property NumberProperty">
                                            <div class="label">强度</div>
                                            <div class="field"><input class="Input input" type="number"
                                                                      autocomplete="off" value="0.24"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="content">
                            <div class="ScriptPanel">
                                <div class="toolbar">
                                    <button class="IconButton" title="新建脚本"><i class="iconfont icon-add script"></i>
                                    </button>
                                    <button class="IconButton" title="新建文件夹"><i class="iconfont icon-add-folder"></i>
                                    </button>
                                    <button class="IconButton disabled" title="编辑"><i class="iconfont icon-edit"></i>
                                    </button>
                                    <button class="IconButton" title="刷新"><i class="iconfont icon-refresh"></i></button>
                                    <button class="IconButton disabled" title="删除"><i class="iconfont icon-delete"></i>
                                    </button>
                                    <div class="ToolbarSeparator">
                                        <div class="separator"></div>
                                    </div>
                                    <button class="IconButton disabled" title="编辑脚本"><i class="iconfont icon-edit"></i>
                                    </button>
                                </div>
                                <div class="content">
                                    <div class="TreeWrap">
                                        <ul class="Tree"></ul>
                                        <div class="LoadMask hidden">
                                            <div class="box">
                                                <div class="msg">加载中...</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="content">
                            <div class="PropertyGrid"></div>
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

        <!-- 文件上传进度条位置 -->
        <div style="width: 95px;">
            <div class="layui-progress layui-progress-big" lay-showpercent="yes" lay-filter="demo">
                <div class="layui-progress-bar" lay-percent=""></div>
            </div>
        </div>

        <!-- 渲染区 -->
        <div class="layui-fluid">
            <div class="layui-row layui-col-space10">
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">全局视角</div>
                        <div id="display" style="width: 800px; height:580px"
                             class="layui-card-body border:1px solid #F00">
                            <div id="display1"></div>
                        </div>
                    </div>
                </div>
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

<div class="layui-footer">
    <!-- 底部固定区域 -->
    底部固定区域
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

        /**
         * tree mode id 
         * scene  1
         * model  101
         * camera 201
         * light  301
         */
        
        var modelFilePath;
        var models
        // 场景的默认显示：
        var int = tree.render({
            elem: "#test1",
            spread: true,
            data:${treeData},
            <%--  场景配置点击事件处理 （模型文件路径，属性列表参数设计） --%>
            click: function (obj){
                // 点击数据显示
                alert(obj.data.id + obj.data.title);
                // 进行单模型加载 [默认 modelId [101-201)]
                if(obj.data.id > 101 && obj.data.id < 201){
                    var modelId = obj.data.id;
                    // 进行 model 查询 - 进行渲染操作
                    $.ajax({
                        url:'<%=path%>/Model/GetModelById',
                        data: {modelId:modelId},
                        type: "POST",
                        success: function (result) {
                            debugger;
                            console.log(result);
                            modelFilePath = result.extend.model.modelFilepath;
                            model = result.extend.model;
                            $("#display1").empty();
                            //$("#display1").html("");
                            // start(modelFilePath);
                            start(model);
                        }
                    })
                }
                
                // get all models by sceneID
                if(obj.data.id == 101){
                    $.ajax({
                        url:'<%=path%>/Model/GetAllModels',
                        type: "POST",
                        success: function (result) {
                            debugger;
                            console.log(result);
                            models = result.extend.models;
                            console.log(models.length);
                            
                            $("#display1").empty();
                            //$("#display1").html("");
                            // start(modelFilePath);
                            start(models);
                        }
                    })
                }
            }
        });
        
        // 属性面板解析
        function attributeResolution() {
            
        }
        
        //  模型文件上传服务 
        var uploadInst = upload.render({
            elem: '#upload',
            url: 'files/upload',     // 上传接口
            method: "post",
            accept: "file",
            done: function (res) {
                // 如果上传失败
                if (res.code > 0)
                    return layer.msg('上传失败');
                else {
                    layer.msg("上传成功");
                    // ++++++++++++++++++++++  待完成
                    // 模型上传完成后，需要进行默认渲染参数等设置，进行页面渲染 
                }
            },
            error: function () {
                // 演示失败状态，并实现重传
                layer.msg('重新上传？', {
                    time: 0 //不自动关闭
                    ,btn: ['是', '否']
                    ,yes: function(index){
                        layer.close(index);
                        uploadInst.upload();
                    }
                });
            }
            // 进度条
            , progress: function (n, index, e) {
                element.progress('demo', n + '%'); // 可配合layui进度条元素使用
                if (n == 100) {
                    layer.msg('上传完毕', {icon: 1});
                }
            }
        });
    });
</script>
</script>
</body>
</html>
