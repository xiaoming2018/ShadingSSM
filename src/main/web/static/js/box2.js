let scene2, renderer2, camera2, light2, controls2; // 场景 、 渲染器
let width2, height2;
let objects2 = [];
let group2 = new THREE.Group();
let dragControls2; // 模型拖曳

function initScene2() {
    var div2 = document.getElementById("display");
    width2 = div2.clientWidth || div2.offsetWidth;
    height2 = div2.clientHeight || div2.offsetHeight;
    scene2 = new THREE.Scene(); // 第二场景
    let gridHelper2 = new THREE.GridHelper(2000, 40);
    scene2.add(gridHelper2);
}

function initCamera2(initCam) {
    debugger;
    if (initCam == null) {  // 如果全局初始化相机为空，按照基础参数默认值
        camera2 = new THREE.PerspectiveCamera(45, width2 / height2, 0.1, 1000);
        camera2.position.set(0, 30, 30);
        camera2.lookAt(0, 0, 0);
        camera2.up.set(0, 1, 0);
        scene2.add(camera2);
    } else {
        if (initCam.cameraType == "Perspective") {
            // 透视相机
            camera2 = new THREE.PerspectiveCamera(initCam.cameraFieldOfView, width2 / height2, initCam.cameraNear, initCam.cameraFar);
            camera2.position.set(initCam.cameraPositionX, initCam.cameraPositionY, initCam.cameraPositionZ);
            camera2.lookAt(initCam.cameraLookatX, initCam.cameraLookatY, initCam.cameraLookatZ);
            camera2.up.set(initCam.cameraUpX, initCam.cameraUpY, initCam.cameraUpZ);
            scene2.add(camera2);
        } else if (initCam.cameraType == "Orthographic") {
            camera2 = new THREE.OrthographicCamera(width2 / -2, width2 / 2, height2 / 2, height2 / -2, initCam.cameraNear, initCam.cameraFar);
            camera2.position.set(initCam.cameraPositionX, initCam.cameraPositionY, initCam.cameraPositionZ);
            camera2.lookAt(initCam.cameraLookatX, initCam.cameraLookatY, initCam.cameraLookatZ);
            camera2.up.set(initCam.cameraUpX, initCam.cameraUpY, initCam.cameraUpZ);
            scene2.add(camera2);
        } else {
            // 非法相机类型 采用透视相机模型进行初始化处理
            camera2 = new THREE.PerspectiveCamera(45, width2 / height2, 0.1, 1000);
            camera2.position.set(0, 20, 30);
            camera2.lookAt(0, 0, 0);
            camera2.up.set(0, 1, 0);
            scene2.add(camera2);
        }
    }
}

function initRender2() {
    renderer2 = new THREE.WebGLRenderer({antialias: true,});
    renderer2.setSize(width2, height2);
    renderer2.setPixelRatio(width2 / height2);
    renderer2.setClearColor(0xb9d3ff, 1);//设置背景颜色(淡蓝色)
    renderer2.shadowMap.enabled = true;
    renderer2.shadowMapSoft = true; // 软阴影
    renderer2.shadowMapType = THREE.PCFSoftShadowMap; //边缘柔和
    // 指定节点
    document.getElementById("display2").appendChild(renderer2.domElement);
}

function loadObject2(i, models) {
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
        scene2.add(object);
    }, onProgress, onError);
}

function initLight2(lights) {
    debugger;
    // light 初始化设置
    for (var k = 0; k < lights.length; k++) {
        if (lights[k].lightType == "AmbientLight") {
            var amlight = new THREE.AmbientLight(lights[k].lightColor, lights[k].lightIntensity);
            amlight.position.set(lights[k].lightPositionX, lights[k].lightPositionY, lights[k].lightPositionZ);
            scene2.add(amlight);
        } else if (lights[k].lightType == "SpotLight") {
            var light = new THREE.SpotLight(lights[k].lightColor, lights[k].lightIntensity);
            light.position.set(lights[k].lightPositionX, lights[k].lightPositionY, lights[k].lightPositionZ);
            light.castShadow = true;
            light.shadowMapHeight = 2048;
            light.shadowMapWidth = 2048;
            scene2.add(light);
        } else {
            let amlight = new THREE.AmbientLight(0xFFFFFF, 0.5);
            amlight.position.set(100, 100, 100);
            scene2.add(amlight);
        }
    }
}


function animate2() {
    // 每帧额外的运算
    controls2.update();
    renderer2.render(scene2, camera2);
    requestAnimationFrame(animate2);
}

function initControls2() {
    controls2 = new THREE.OrbitControls(camera2, renderer2.domElement);
    // 设置控制器的中心点
    controls2.target.set(0, 0, 0);
    controls2.enableDamping = true;
    controls2.dampingFactor = 0.25;
    controls2.enableZoom = true;
    controls2.autoRotate = false;
    controls2.minDistance = 1;
    controls2.maxDistance = 2000;
    controls2.enablePan = true;
}

function draw2(camera, models, lights) {
    // debugger;
    // var models = modelList[0];
    // var lights = lightList[0];

    debugger;
    initScene2();
    initCamera2(camera);
    initRender2();
    for (var i = 0; i < models.length; i++) {
        loadObject2(i, models);
    }
    initLight2(lights);
    initControls2();
    animate2();
    document.getElementById('display2').appendChild(renderer2.domElement);
}