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

function initCamera() {
    camera = new THREE.PerspectiveCamera(45, width / height, 0.1, 1000);
    camera.position.set(0, 20, 30);
    camera.lookAt(0, 0, 0);
    camera.up.set(0,1,0);
    scene.add(camera);
}

function initrenderer() {
    renderer = new THREE.WebGLRenderer({antialias: true});
    renderer.setSize(width, height);
    renderer.setPixelRatio(width / height);
    renderer.setClearColor(0xb9d3ff, 1);//设置背景颜色(淡蓝色)
    //renderer.setClearColor(0xffffff, 1);//设置背景颜色
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
    debugger
    console.log("序号：" + i + " path: " + models[i].modelFilePath);
    var path = models[i].modelFilePath;

    var manager = new THREE.LoadingManager();
    manager.addHandler(/\.dds$/i, new THREE.DDSLoader());
    var objLoader = new THREE.OBJLoader(manager);
    objLoader.load(path, function (object) {
        object.traverse(function (child) {
            if (child instanceof THREE.Mesh) {
                child.position.set(0, 0, 0);
                child.castShadow = true;
                child.receiveShadow = true;
                child.indexId = i;
                child.name = models[i].modelTitle;
                child.modelid = models[i].modelId;
            }
        });
        object.castShadow = true;
        object.receiveShadow = true;

        debugger;
        object.indexId = i; // models 下表索引值
        object.name = models[i].modelTitle;
        object.modelid = models[i].modelId;
        
        objects.push(object); // 进行控制拖曳控制
        scene.add(object);
    }, onProgress, onError);

    // var mtlLoader = new THREE.MTLLoader(manager);
    // mtlLoader.load("/upload/box.mtl", function (materials) {
    //     materials.preload();
    //     var objLoader = new THREE.OBJLoader(manager);
    //     objLoader.setMaterials(materials);
    //     objLoader.load(models[i].modelFilePath, function (object) {
    //         object.scale.set(1, 1, 1); // 缩放设置 
    //         object.traverse(function (child) {
    //             if (child instanceof THREE.Mesh) {
    //                 child.castShadow = true;
    //                 child.receiveShadow = true;
    //             }
    //         });
    //         let bbox = new THREE.Box3().setFromObject(object);
    //         x = bbox.max.x - bbox.min.x;
    //         y = bbox.max.y - bbox.min.y;
    //         z = bbox.max.z - bbox.min.z;
    //        
    //         debugger;
    //         let tempx = -(bbox.max.x - bbox.min.x)/ 2 + (i * 10);
    //         console.log(tempx);
    //        
    //         object.position.set(-(bbox.max.x - bbox.min.x) / 2 + (i * 10),
    //             -(bbox.max.y - bbox.min.y) / 2,
    //             -(bbox.max.z - bbox.min.z) / 2);
    //        
    //         debugger;
    //         object.indexId = i; // models 下表索引值
    //         object.name = models[i].modelTitle;
    //         object.modelid = models[i].modelId;
    //        
    //         if (y / x >= i) {
    //             let h = y;
    //             let fov = camera.fov * Math.PI / 180;
    //             m = h / (2 * Math.tan(fov * 0.5));
    //             camera.position.y = 0;
    //             camera.position.z = 2 * m + (z / 2);
    //             camera.position.x = 0;
    //         } else {
    //             let w = x;
    //             let h = w * i;
    //             let Fov = camera.fov * Math.PI / 180;
    //             m = h / (2 * Math.tan(Fov * 0.5));
    //             camera.position.y = 0;
    //             camera.position.z = 2 * m + (z / 2);
    //             camera.position.x = 0;
    //         }
    //         objects.push(object); // 进行控制拖曳控制
    //         group.add(object);
    //         scene.add(group);
    //     }, onProgress, onError);
    // });
}

function initDragControls(models) {
    dragControls = new THREE.DragControls(objects, camera, renderer.domElement);
    dragControls.addEventListener('dragstart', function () {
        controls.enabled = false;
        isPaused = true;
    });
    dragControls.addEventListener('dragend', function (event) {
        controls.enabled = true;
        isPaused = false;
        getModelPosition(event, models);
    })
}

// get model positon 更新数据
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
function getModelPosition(event, models) {
    debugger;
    var tmp_object = event.object;
    console.log(tmp_object);
    // 进行页面位置更新 与 数据库更新
    let model = models[tmp_object.indexId];
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
        url: "/ShadingSSM/Model/Update",
        data: model,
        type: "post",   
        success: function (result) {
            if (result.code == 200) {
                layer.msg("update position information faield, please try again!");
            }
        }
    })
}


function initObject() {
    var manager = new THREE.LoadingManager();
    var texture = new THREE.Texture();
    var loader = new THREE.ImageLoader(manager);
    //loader.load('webgl_resource/models/texture/female.jpg', function (image) {
    loader.load('webgl_resource/models/mtl/textured_material0000_map_Kd.png', function (image) {
        texture.image = image;
        texture.needsUpdate = true;
    });

    var material = new THREE.MeshBasicMaterial({map: texture});
    var loader = new THREE.OBJLoader(manager);
    //loader.load('webgl_resource/models/obj/Female.obj', function (object) {
    loader.load('webgl_resource/models/mtl/textured.obj', function (object) {
        var mesh = new THREE.Mesh(object, material);
        object.traverse(function (child) {
            if (child instanceof THREE.Mesh) {
                child.material.map = texture;
                child.position.set(0, 3, -3);
                child.castShadow = true;
                child.receiveShadow = true;
            }
        });
        object.castShadow = true;  // 模型也产生阴影
        object.receiveShadow = true;
        scene.add(object);//将导入的模型添加到场景
    });
}

//初始化灯光
var light;
var amlight;

function initLight() {
    amlight = new THREE.AmbientLight(0xFFFFFF, 0.5);
    amlight.position.set(100, 100, 100);
    scene.add(amlight);

    light = new THREE.SpotLight(0xFFFFFF, 0.5);
    // light.position.set(2, 10, 10);
    light.position.set(200, 200, 200);
    light.castShadow = true;
    light.shadowMapHeight = 2048;
    light.shadowMapWidth = 2048;
    scene.add(light);
}

var plane;

function plane_fun() {
    var planeGeometry = new THREE.PlaneGeometry(200, 200);//平面
    var planeMaterial = new THREE.MeshLambertMaterial({color: 0xffffff});
    plane = new THREE.Mesh(planeGeometry, planeMaterial);
    plane.rotation.x = -0.5 * Math.PI;//将平面沿着x轴进行旋转
    plane.position.x = 0;
    plane.position.y = -0.8;
    plane.position.z = 0;
    plane.receiveShadow = true;//平面进行接受阴影
    scene.add(plane);
}

function animate() {
    //camera.updateProjectionMatrix();
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

function start(models) {
    debugger;
    console.log(models);

    //初始化统计对象
    initscene();
    initCamera();
    //plane_fun();
    initrenderer();
    //initObject();

    // 根据传参 进行多模型加载
    for (var i = 0; i < models.length; i++) {
        debugger;
        loadObject(i, models);
    }
    initLight();
    initControls();

    composer = new THREE.ThreeJs_Composer(renderer, scene, camera, options);

    initDragControls(models);
    animate();
    document.getElementById('display1').appendChild(renderer.domElement);
}