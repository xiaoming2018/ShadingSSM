var mv_stats;
var mv_camera, mv_scene, mv_renderer, mv_controls, mv_composer, mv_options;
var objects = [];

function initScene(){
    mv_scene = new THREE.Scene();
    mv_scene.background = new THREE.Color( 0xf0f0f0 );
    mv_scene.fog = new THREE.Fog(mv_scene.background, 3000, 5000);
}

function initCamera(){
    mv_camera = new THREE.PerspectiveCamera(45, window.innerWidth / window.innerHeight, 0.1, 10000);
    mv_camera.position.set(0, 50, 200);
    mv_camera.lookAt(new THREE.Vector3(0, 0, 0));
    mv_scene.add(mv_camera);
}

function initLight(){
    let directionalLight = new THREE.DirectionalLight(0xffffff, 0.3); //模拟远处类似太阳的光源
    directionalLight.color.setHSL(0.1, 1, 0.95);
    directionalLight.position.set(0, 200, 0).normalize();
    mv_scene.add(directionalLight);

    let ambient = new THREE.AmbientLight(0xffffff, 1); //AmbientLight,影响整个场景的光源
    ambient.position.set(0, 0, 0);
    mv_scene.add(ambient);
}

// 初始化性能插件
function initStats(){
    mv_stats = new Stats();
    mv_stats.domElement.style.position = 'absolute';
    mv_stats.domElement.style.left = '0px';
    mv_stats.domElement.style.top = '0px';
    document.body.appendChild(mv_stats.domElement);
}


function initRenderer(){
    mv_renderer = new THREE.WebGLRenderer({antialias: true});
    mv_renderer.setSize(window.innerWidth, window.innerHeight);
    mv_renderer.setClearColor(0x4682B4, 1.0);
    document.body.appendChild(mv_renderer.domElement);
}

// 创建地板
function createFloor(){
    var loader = new THREE.TextureLoader();
    loader.load("resource/image/floor.jpg", function (texture){
        texture.wrapS = texture.wrapT = THREE.RepeatWrapping;
        texture.repeat.set(10, 10);
        var floorGeometry = new THREE.BoxGeometry(2600, 1400, 1);
        var floorMaterial = new THREE.MeshBasicMaterial({
            map: texture,
        });
        var floor = new THREE.Mesh(floorGeometry, floorMaterial);
        floor.rotation.x = -Math.PI / 2;
        floor.name = "地面";
        mv_scene.add(floor);
    });
}

// 初始化模型
function initContent(){
    
    // 辅助网格
    let gridHelper = new THREE.GridHelper(2000, 40);
    mv_scene.add(gridHelper); 

    // cubes
    let cubeGeo = new THREE.BoxBufferGeometry(50, 50, 50);
    let cubeMaterial = new THREE.MeshLambertMaterial({color: 0xfeb74c});
    
    var voxel = new THREE.Mesh(cubeGeo, cubeMaterial);
    voxel.position.set(25, 25, 25);
    voxel.name = "货物$1";
    voxel.modelid = 1001;
    mv_scene.add(voxel);
    objects.push(voxel);

    var voxel2 = voxel.clone();
    voxel2.position.set(225, 25, 25);
    voxel2.name = "货物$2";
    voxel2.modelid = 1002;
    mv_scene.add(voxel2);
    objects.push(voxel2);

    var voxel3 = voxel.clone();
    voxel3.position.set(-225, 25, 25);
    voxel3.name = "货物$3";
    voxel3.modelid = 1003;
    mv_scene.add(voxel3);
    objects.push(voxel3);
}

// 初始化 轨迹球控件
function initControls(){
    mv_controls = new THREE.OrbitControls(mv_camera, mv_renderer.domElement);
    mv_controls.enableDamping = true;
    mv_controls.dampingFactor = 0.5;
    mv_controls.minDistance = 2;
    // 视角最远距离
    mv_controls.maxDistance = 5000;
    // 最大角度
    mv_controls.maxPolarAngle = Math.PI / 2.2;
    mv_controls.target = new THREE.Vector3(50,50,0);
}

function init(){

    initRenderer();
    initScene();
    initContent();
    initCamera();
    initLight();
    initStats();
    initControls();
    
    //添加选中时的蒙版
    mv_composer = new THREE.ThreeJs_Composer(mv_renderer, mv_scene, mv_camera, mv_options);
    
    // 添加拖动效果
    var dragControls = new THREE.DragControls(objects, mv_camera, mv_renderer.domElement);
    dragControls.addEventListener('dragstart', function(event){
        mv_controls.enabled = false;
        isPaused = true;
    });
    dragControls.addEventListener('dragend', function(event){
        mv_controls.enabled = true;
        isPaused = false;
        getModelPosition(event);
    });
    
    document.addEventListener('resize', onWindowResize, false);
    animate();
}

function onWindowResize(){
    mv_camera.aspect = window.innerWidth / window.innerHeight;
    mv_camera.updateProjectionMatrix();
    mv_renderer.setSize(window.innerWidth, window.innerHeight);
}

function animate() {
    requestAnimationFrame(animate);
    mv_renderer.render(mv_scene, mv_camera);
    mv_composer.render();
    update();
}

// 更新控件
function update() {
    mv_stats.update();
    mv_controls.update();
}

// get model position 更新数据
function getModelPosition(event){
    debugger;
    var tmp_object = event.object;
    console.log(tmp_object);
    console.log("position:" + tmp_object.position.x + "  " + tmp_object.position.y + " " + tmp_object.position.z);
}