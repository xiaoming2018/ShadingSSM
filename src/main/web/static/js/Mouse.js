let sence, camera, renderer, controllers, light, selectObject;

// scene
function initScene() {
    scene = new THREE.Scene();
}

// camera
function initCamera() {
    camera = new THREE.PerspectiveCamera(45, window.innerWidth / window.innerHeight, 0.1, 1000);
    camera.position.set(0, 400, 600);
    camera.lookAt(new THREE.Vector3(0, 0, 0));
    scene.add(camera);
}

// renderer
function initRenderer() {
    renderer = new THREE.WebGLRenderer({antialias: true});
    renderer.setSize(window.innerWidth, window.innerHeight);
    renderer.setClearColor(0x050505);
    document.getElementById("demo").appendChild(renderer.domElement);
}

// init model
function initContent() {
    let helper = new THREE.GridHelper(1200, 500, 0xCD3700, 0x4A4A4A);
    scene.add(helper);

    let cubeGeometry = new THREE.BoxGeometry(100, 100, 100);
    let cubeMaterial = new THREE.MeshLambertMaterial({color: 0x9370DB});
    let cube = new THREE.Mesh(cubeGeometry, cubeMaterial);
    cube.position.y = 50;
    cube.name = "cube";
    scene.add(cube);

    let sphereGeometry = new THREE.SphereGeometry(50, 50, 50, 50);
    let sphereMaterial = new THREE.MeshLambertMaterial({color:0x3CB371});
    let sphere = new THREE.Mesh(sphereGeometry, sphereMaterial);
    sphere.position.x = 200;
    sphere.position.y = 50;
    sphere.name = "sphere";
    scene.add(sphere);
    
    let cylinderGeometry = new THREE.CylinderGeometry(50, 50, 100, 100);
    let cylinderMaterial = new THREE.MeshLambertMaterial({color: 0xCD7054});
    let cylinder = new THREE.Mesh(cylinderGeometry, cylinderMaterial);
    cylinder.position.x = -200;
    cylinder.position.y = 50;
    scene.add(cylinder);
}

// 鼠标双击方法
function onMouseDoubleClick(event) {
    // 获取 raycaster 与 模型相交数组，
    let intersects = getIntersects(event);
    
    // 获取选中最近的Mesh对象
    if(intersects.length != 0 && intersects[0].object instanceof  THREE.Mesh){
        selectObject = intersects[0].object;
        changeMaterial(selectObject);
    }
}

// 获取与射线相交的对象数组
function getIntersects(event) {
    event.preventDefault();
    console.log("event.clientX:" + event.clientX);
    console.log("event.clientY:" + event.clientY);
    
    // 声明 raycaster 和 mouse 变量
    let raycaster = new THREE.Raycaster();
    let mouse = new THREE.Vector2();
    
    // 通过鼠标位置，计算 raycaster 所需点位置，以屏幕为中心， 范围[-1, 1]
    mouse.x = (event.clientX / window.innerWidth) * 2 - 1;
    mouse.y = -(event.clientY / window.innerHeight) * 2 + 1;
    
    // 通过鼠标点击的位置（二维坐标）和 当前相机的矩阵计算出射线的位置
    raycaster.setFromCamera(mouse, camera);
    
    // 获取与射线相交的对象数组，其中元素按照距离排序，近的在前
    let intersects = raycaster.intersectObjects(scene.children, true);
    
    // 返回对象
    return intersects;
}

// 窗口触发
function onWindowResize() {
    camera.aspect = window.innerWidth / window.innerHeight;
    camera.updateProjectionMatrix();
    renderer.setSize(window.innerWidth, window.innerHeight);
}

// 键盘触发 enter 初始化相机与 相机控制
function onKeyDown(event){
    switch (event.keyCode){
        case 13:
            initCamera();
            initControls();
            break;
    }
}

function changeMaterial(object) {
    let material = new THREE.MeshLambertMaterial({
        color: 0xffffff * Math.random(),
        transparent: object.material.transparent ? false : true,
        opacity: 0.8
    })
    object.material = material;
}

// 初始化轨迹空间
function initControls(){
    controllers = new THREE.TrackballControls(camera, renderer.domElement);
    controllers.noPan = true;
}

// 初始化 灯光
function initLight(){
    light = new THREE.SpotLight(0xffffff);
    light.position.set(-300, 600, -400);
    light.castShadow = true;
    
    scene.add(light);
    scene.add(new THREE.AmbientLight(0x5C5C5C));
}

// 更新 div
function renderDiv(object){
    let halfwidth = window.innerWidth / 2;
    let halfheight = window.innerHeight / 2;
    
    // 逆转相机求出 二维坐标
    let vector = object.position.clone().project(camera);
    
    // 修改 div
    $("#label").css({
        left: vector.x * halfwidth + halfwidth,
        top: -vector.y * halfheight + halfheight - object.position.y
    })
    
    $("label") .text("name:" + object.name);
}

function update(){
    controllers.update();
    controllers.handleResize();
}

function animate(){
    if(selectObject != undefined && selectObject != null){
        renderDiv(selectObject);
    }
    requestAnimationFrame(animate);
    renderer.render(scene, camera);
    update();
}

function init(){
    debugger;
    initScene();
    initCamera();
    initRenderer();
    initContent();
    initLight();
    initControls();
    animate();
    addEventListener('dblclick', onMouseDoubleClick,false);
    addEventListener('resize', onWindowResize, false);
    addEventListener('keydown', onKeyDown, false);
}
