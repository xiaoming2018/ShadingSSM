<%--
  Created by IntelliJ IDEA.
  User: sun xiaoming
  Date: 2019/3/19
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Product Add jsp</title>
    <% String path = request.getContextPath(); %>
    <link href="<%=path%>/static/layui/css/layui.css" rel="stylesheet" type="text/css">
    <script src="<%=path%>/static/js/JQuery3.6.0.js"></script>
    <script src="<%=path%>/static/layui/layui.js"></script>

</head>
<body>
<br>
<form class="layui-form" id="form_test">
    <div class="layui-form-item">
        <label class="layui-form-label">模型名称：</label>
        <div class="layui-input-block">
            <input type="text" name="modelTitle" required lay-verify="required"
                   placeholder="请输入模型名称" autocomplete="off" class="layui-input" style="width: 400px">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">模型类型：</label>
        <div class="layui-input-block" style="width: 400px">
            <select name="modelType" lay-verify="required">
                <option value=""></option>
                <c:forEach var="type" items="${modelTypeList}">
                    <option value="${type.modelTypeId}">${type.modelTypeName}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    
    <div class="layui-form-item">
        <label class="layui-form-label">模型文件：</label>
        <div class="layui-input-block">
            <input type="hidden" id="pic" name="modelFilepath" value="" lay-verify="required"/>
            <div class="layui-input-list">
                <p id="demoText"></p>
                <button type="button" class="layui-btn" id="test1"><i class="layui-icon">&#xe67c;</i>文件上传</button>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo" id="submit">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    var filepath;
    var index = parent.layer.getFrameIndex(window.name);
    layui.use('form', function () {
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function (data) {
            //layer.msg(JSON.stringify(data.field));
            $.ajax({
                url: "<%=path%>/Model/AddModel",
                dataType: 'json',
                data: data.field,
                success: function (data) {
                    if (data.code == 100) {
                        layer.msg("添加成功");
                        parent.layer.close(index);
                    } else {
                        layer.msg("添加失败，请重新操作！");
                    }
                },
                error: function () {
                    layer.msg("返回数据错误");
                }
            });
            // 取消自动提交；
            return false;
        });
    });

    layui.use('upload', function () {
        var upload = layui.upload;
        var uploadInst = upload.render({
            elem: '#test1',
            url: '<%=path%>/files/upload',
            // acceptMime: 'image/*',
            //auto:false,
            //bindAction:'#submit',
            accept: "file",
            field: 'modelfile',  // 图片字段名 与 后台接受参数名对应一致
            done: function (res) {
                //如果上传失败
                if (res.code == 200) {
                    return layer.msg('文件上传失败');
                } else {
                    debugger;
                    filepath = res.extend.filePath;
                    $("#pic").val(filepath); // 设置filepath
                    var span = $("<span style='color: #FF5722;'></span>").append("模型文件上传成功!");
                    $("#demoText").empty().append(span);
                    return layer.msg('文件上传成功');
                }
            },
            error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        });
    })
</script>
</body>
</html>
