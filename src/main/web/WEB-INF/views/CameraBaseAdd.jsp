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
        <label class="layui-form-label">相机名称：</label>
        <div class="layui-input-block">
            <input type="text" name="cameraTitle" required lay-verify="required"
                   placeholder="请输入相机名称" autocomplete="off" class="layui-input" style="width: 400px">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">相机类型：</label>
        <div class="layui-input-block" style="width: 400px">
            <select name="cameraType" lay-verify="required">
                <option value=""></option>
                <option value="Orthographic">正投影相机</option>
                <option value="Perspective">透视投影相机</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">相机位置：</label>
        <div class="layui-input-block" style="width: 400px">
            <div class="layui-row layui-col-space5">
                <div class="layui-col-md4">
                    <div class="grid-demo grid-demo-bg1">x:
                        <input name="cameraPositionX">
                    </div>
                </div>
                <div class="layui-col-md4">
                    <div class="grid-demo">y:
                        <input name="cameraPositionY">
                    </div>
                </div>
                <div class="layui-col-md4">
                    <div class="grid-demo grid-demo-bg1">z:
                        <input name="cameraPositionZ">
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <%--  很多参数需要设置  正视相机的 6个参数 透视相机的4个参数(fov,near,far,aspect) aspect 实际窗口纵横比 --%>
    
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo" id="submit">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    var index = parent.layer.getFrameIndex(window.name);
    layui.use('form', function () {
        var form = layui.form;
        
        // 监听提交
        form.on('submit(formDemo)', function (data) {
            //layer.msg(JSON.stringify(data.field));
            $.ajax({
                url: "<%=path%>/Camera/AddCamera",
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
    
</script>
</body>
</html>
