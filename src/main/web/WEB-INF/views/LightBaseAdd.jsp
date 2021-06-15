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
    <title>Light Add</title>
    <% String path = request.getContextPath(); %>
    <link href="<%=path%>/static/layui/css/layui.css" rel="stylesheet" type="text/css">
    <script src="<%=path%>/static/js/JQuery3.6.0.js"></script>
    <script src="<%=path%>/static/layui/layui.js"></script>

</head>
<body>
<br>
<form class="layui-form" id="form_test">
    <div class="layui-form-item">
        <label class="layui-form-label">LightName：</label>
        <div class="layui-input-block">
            <input type="text" name="lightTitle" required lay-verify="required"
                   placeholder="please input the light name" autocomplete="off" class="layui-input" style="width: 400px">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">LightType：</label>
        <div class="layui-input-block" style="width: 400px">
            <select name="lightType" lay-verify="required">
                <option value=""></option>
                <option value="AmbientLight">AmbientLight</option>
                <option value="DirectionalLight">DirectionalLight</option>
                <option value="AreaLight">AreaLight</option>
                <option value="PointLight">PointLight</option>
                <option value="SpotLight">SpotLight</option>
                <option value="HemisphereLight">HemisphereLight</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">LightPosition：</label>
        <div class="layui-input-block" style="width: 400px">
            <div class="layui-row layui-col-space5">
                <div class="layui-col-md4">
                    <div class="grid-demo grid-demo-bg1">Position X:
                        <input name="lightPositionX">
                    </div>
                </div>
                <div class="layui-col-md4">
                    <div class="grid-demo">Position Y:
                        <input name="lightPositionY">
                    </div>
                </div>
                <div class="layui-col-md4">
                    <div class="grid-demo grid-demo-bg1">Position Z:
                        <input name="lightPositionZ">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">LightColor：</label>
        <div class="layui-input-block" style="width: 400px">
            <div class="property ColorProperty">
                <div class="label">Selection of Color</div>
                <div class="field"><input id="color" name="lightColor" class="Input input" type="color"
                                          autocomplete="off" value="#ffffff"></div>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">LightIntensity：</label>
        <div class="layui-input-block">
            <div class="property NumberProperty">
                <div class="label">Intensity</div>
                <div class="field"><input id="intensity" name="lightIntensity" class="Input input" type="number"
                                          autocomplete="off" value="0.24"></div>
            </div>
        </div>
    </div>
    
    
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo" id="submit">submit</button>
            <button type="reset" class="layui-btn layui-btn-primary">Reset</button>
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
            debugger;
            $.ajax({
                url: "<%=path%>/Light/AddLight",
                type:"POST",
                dataType: 'json',
                data: data.field,
                success: function (data) {
                    if (data.code == 100) {
                        layer.msg("add success!");
                        parent.layer.close(index);
                    } else {
                        layer.msg("add failed and try again!");
                    }
                },
                error: function () {
                    layer.msg("return data error!");
                }
            });
            // 取消自动提交；
            return false;
        });
    });
    
</script>
</body>
</html>
