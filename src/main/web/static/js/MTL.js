let scene, camera, renderer, controls, composer, options;
let width, height;
let objects = []; // 拖拽控制
let group = new THREE.Group(); // 记载object
let i, m, x, y, z;
let dragControls; // 模型拖拽

function initscene() {
    var div = document.getElementById("display");
    width = div.clientWidth || div.offsetWidth;
    height = div.clientHeight || div.offsetHeight;
    i = width / height;
    scene = new THREE.Scene();
    let gridHelper = new THREE.GridHelper(2000, 40);
    scene.add(gridHelper); // 网格辅助
}

function initCamera(initCam) {
    debugger;
    if (initCam == null) {  // 如果全局初始化相机为空，按照基础参数默认值
        camera = new THREE.PerspectiveCamera(45, width / height, 0.1, 1000);
        camera.position.set(0, 20, 30);
        camera.lookAt(0, 0, 0);
        camera.up.set(0, 1, 0);
        scene.add(camera);
    } else {
        if (initCam.cameraType == "Perspective") {
            // 透视相机
            camera = new THREE.PerspectiveCamera(initCam.cameraFieldOfView, width / height, initCam.cameraNear, initCam.cameraFar);
            camera.position.set(initCam.cameraPositionX, initCam.cameraPositionY, initCam.cameraPositionZ);
            camera.lookAt(initCam.cameraLookatX, initCam.cameraLookatY, initCam.cameraLookatZ);
            camera.up.set(initCam.cameraUpX, initCam.cameraUpY, initCam.cameraUpZ);
            scene.add(camera);

        } else if (initCam.cameraType == "Orthographic") {
            camera = new THREE.OrthographicCamera(width / -2, width / 2, height / 2, height / -2, initCam.cameraNear, initCam.cameraFar);
            camera.position.set(initCam.cameraPositionX, initCam.cameraPositionY, initCam.cameraPositionZ);
            camera.lookAt(initCam.cameraLookatX, initCam.cameraLookatY, initCam.cameraLookatZ);
            camera.up.set(initCam.cameraUpX, initCam.cameraUpY, initCam.cameraUpZ);
            scene.add(camera);
        } else {
            // 非法相机类型 采用透视相机模型进行初始化处理
            camera = new THREE.PerspectiveCamera(45, width / height, 0.1, 1000);
            camera.position.set(0, 20, 30);
            camera.lookAt(0, 0, 0);
            camera.up.set(0, 1, 0);
            scene.add(camera);
        }
    }
}

function initrenderer() {
    renderer = new THREE.WebGLRenderer({antialias: true});
    renderer.setSize(width, height);
    renderer.setPixelRatio(width / height);
    renderer.setClearColor(0xb9d3ff, 1);//设置背景颜色(淡蓝色)
    renderer.shadowMap.enabled = true;    // 告诉渲染器需要
    renderer.shadowMapSoft = true; // 软阴影
    renderer.shadowMapType = THREE.PCFSoftShadowMap; //边缘柔和
    document.getElementById('display1').appendChild(renderer.domElement);
}

var onProgress = function (xhr) {
    if (xhr.lengthComputable) {
        var percentComplete = xhr.loaded / xhr.total * 100;
        console.log(Math.round(percentComplete, 2) + '% downloaded');
    }
};

var onError = function (xhr) {
    console.log(xhr);
};

function loadObject(i, models) {
    debugger;
    console.log("序号：" + i + " path: " + models[i].modelFilePath);
    var path = models[i].modelFilePath;
    var manager = new THREE.LoadingManager();
    manager.addHandler(/\.dds$/i, new THREE.DDSLoader());
    var objLoader = new THREE.OBJLoader(manager);
    objLoader.load(path, function (object) {
        object.traverse(function (child) {
            if (child instanceof THREE.Mesh) {
                // 设置模型位置、缩放、旋转
                child.position.set(models[i].modelPositionX, models[i].modelPositionY, models[i].modelPositionZ);
                child.scale.set(models[i].modelScaleX, models[i].modelScaleY, models[i].modelScaleZ);
                child.rotateX = models[i].modelRotationX;
                child.rotateY = models[i].modelRotationY;
                child.rotateZ = models[i].modelRotationZ;

                child.castShadow = true;
                child.receiveShadow = true;

                child.configType = "model";
                child.indexId = i;
                child.name = models[i].modelTitle;
                child.modelid = models[i].modelId;
            }
        });
        objects.push(object); // 进行控制拖曳控制
        scene.add(object);
    }, onProgress, onError);
}

function initDragControls(models, cameras) {
    dragControls = new THREE.DragControls(objects, camera, renderer.domElement);
    dragControls.addEventListener('dragstart', function () {
        controls.enabled = false;
        isPaused = true;
    });
    dragControls.addEventListener('dragend', function (event) {
        controls.enabled = true;
        isPaused = false;
        getModelPosition(event, models, cameras);
    })
}

/**
 * event.object
 *   -- position
 *   -- quaternion
 *   -- rotation
 *   -- scale
 *   -- up
 *
 * @param event
 * @param models
 */
function getModelPosition(event, models, cameras) {
    debugger;
    var tmp_object = event.object;
    console.log(tmp_object);
    if (tmp_object.configType == "model") {
        // 进行页面位置更新 与 数据库更新
        let model = models[tmp_object.indexId];
        $("#light").css('light', 'none'); // 光源折叠
        $("#config").css('display', 'block');
        $("#name").val(model.modelTitle);
        if (model.modelTypeId == 401) {
            $("#type").empty().html("OBJ");
        } else if (model.modelTypeId == 402) {
            $("#type").empty().html("PLY");
        } else {
            $("#type").empty().html("Other");
        }
        $("#posX").val(tmp_object.position.x);
        $("#posY").val(tmp_object.position.y);
        $("#posZ").val(tmp_object.position.z);

        model.modelPositionX = tmp_object.position.x;
        model.modelPositionY = tmp_object.position.y;
        model.modelPositionZ = tmp_object.position.z;

        // model数据库更新
        delete model.createTime;
        delete model.updateTime;

        $.ajax({
            url: "/ShadingSSM/Model/UpdateModel",
            data: model,
            type: "post",
            success: function (result) {
                if (result.code == 200) {
                    layer.msg("update position information failed, please try again!");
                }
            }
        })
    } else if (tmp_object.configType == "camera") {
        let camera = cameras[tmp_object.indexId];
        $("#config").css('display', 'block');
        $("#light").css('light', 'none');
        $("#name").val(camera.cameraTitle);

        $("#type").empty().html(camera.cameraType);

        $("#posX").val(tmp_object.position.x);
        $("#posY").val(tmp_object.position.y);
        $("#posZ").val(tmp_object.position.z);

        camera.cameraPositionX = tmp_object.position.x;
        camera.cameraPositionY = tmp_object.position.y;
        camera.cameraPositionZ = tmp_object.position.z;

        delete camera.createTime;
        delete camera.updateTime;

        $.ajax({
            url: "/ShadingSSM/Camera/UpdateCamera",
            data: camera,
            type: "post",
            success: function (result) {
                if (result.code == 200) {
                    layer.msg("update camera position information failed " + result.extend.message);
                }
            }
        });
    }
}

function loadCameraModel(j, cameras) {
    debugger;
    var cameraPath = "/upload/camera";
    var cameraManager = new THREE.LoadingManager();
    cameraManager.addHandler(/\.dds$/i, new THREE.DDSLoader());
    var cameraLoader = new THREE.OBJLoader(cameraManager);
    cameraLoader.load(cameraPath + ".obj", function (object) {
        object.traverse(function (child) {
            if (child instanceof THREE.Mesh) {
                child.position.set(cameras[j].cameraPositionX, cameras[j].cameraPositionY, cameras[j].cameraPositionX);
                child.scale.set(1, 1, 1);
                
                // 旋转坐标 计算
                var thera_z = Math.atan2(cameras[j].cameraPositionY, cameras[j].cameraPositionX);
                var thera_x = Math.atan2(cameras[j].cameraPositionY, cameras[j].cameraPositionZ);
                var thera_y = Math.atan2(cameras[j].cameraPositionZ, cameras[j].cameraPositionX);
                
                // 角度--弧度 绕自身旋转
                
                //child.rotation.set(0, 0, 10);
                child.rotateY(-45);
                child.rotateZ(-45);
                
                // 旋转角度计算 lookat position and up
                child.castShadow = true;
                child.receiveShadow = true;

                child.configType = "camera";
                child.indexId = j;
                child.name = cameras[j].cameraTitle;
                child.cameraId = cameras[j].cameraId;
            }
        });
        objects.push(object);
        scene.add(object);
    }, onProgress, onError);
}

function initLight(lights) {
    debugger;
    // light 初始化设置
    for (var k = 0; k < lights.length; k++) {
        if (lights[k].lightType == "AmbientLight") {
            var amlight = new THREE.AmbientLight(lights[k].lightColor, lights[k].lightIntensity);
            amlight.position.set(lights[k].lightPositionX, lights[k].lightPositionY, lights[k].lightPositionZ);
            scene.add(amlight);
        } else if (lights[k].lightType == "SpotLight") {
            var light = new THREE.SpotLight(lights[k].lightColor, lights[k].lightIntensity);
            light.position.set(lights[k].lightPositionX, lights[k].lightPositionY, lights[k].lightPositionZ);
            light.castShadow = true;
            light.shadowMapHeight = 2048;
            light.shadowMapWidth = 2048;
            scene.add(light);
        } else {
            let amlight = new THREE.AmbientLight(0xFFFFFF, 0.5);
            amlight.position.set(100, 100, 100);
            scene.add(amlight);
        }
    }
}

function animate() {
    controls.update();
    renderer.render(scene, camera);
    requestAnimationFrame(animate);
}

//用户交互插件 鼠标左键按住旋转，右键按住平移，滚轮缩放
function initControls() {
    controls = new THREE.OrbitControls(camera, renderer.domElement);
    controls.target.set(0, 0, 0);
    controls.enableDamping = true;
    //动态阻尼系数 就是鼠标拖拽旋转灵敏度
    controls.dampingFactor = 0.25;
    controls.enableZoom = true;
    controls.autoRotate = false;
    controls.minDistance = 2;
    controls.maxDistance = 2000;
    controls.enablePan = true;
}

function start(initCam, models, cameras, lights) {
    debugger;
    initscene();
    initCamera(initCam);
    initrenderer();
    for (var i = 0; i < models.length; i++) {
        debugger;
        loadObject(i, models);
    }
    for (var j = 0; j < cameras.length; j++) {
        loadCameraModel(j, cameras);
    }
    initLight(lights);
    initControls();
   
   //composer = new THREE.ThreeJs_Composer(renderer, scene, camera, options);

    initDragControls(models, cameras);
    animate();
    document.getElementById('display1').appendChild(renderer.domElement);
}