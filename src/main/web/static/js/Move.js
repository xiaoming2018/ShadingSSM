let stats;
let camera, scene, renderer, controls, composer, transformControls, options;
let mouse, raycaster;
let rollOverMesh, rollOverMaterial;
let cubeGeo, cubeMaterial;
let objects = []; // 模型数组
let floor, gridHelper;
let selectobject = [];


/**
 * 初始化变量
 */

function initScene(){
    scene = new THREE.Scene();
    scene.background = new THREE.Color( 0xf0f0f0 );
    scene.fog = new THREE.Fog(scene.background, 3000, 5000);
}

function initCamera(){
    camera = new THREE.PerspectiveCamera(45, window.innerWidth / window.innerHeight, 0.1, 10000);
    camera.position.set(0, 800, 1500);
    camera.lookAt(new THREE.Vector3(0, 0, 0));
    scene.add(camera);
}

function initLight(){
    let directionalLight = new THREE.DirectionalLight(0xffffff, 0.3); //模拟远处类似太阳的光源
    directionalLight.color.setHSL(0.1, 1, 0.95);
    directionalLight.position.set(0, 200, 0).normalize();
    scene.add(directionalLight);

    let ambient = new THREE.AmbientLight(0xffffff, 1); //AmbientLight,影响整个场景的光源
    ambient.position.set(0, 0, 0);
    scene.add(ambient);
}

function initRenderer(){
    renderer = new THREE.WebGLRenderer({antialias: true});
    renderer.setSize(window.innerWidth, window.innerHeight);
    renderer.setClearColor(0x4682B4, 1.0);
    document.body.appendChild(renderer.domElement);
}

// 初始化 轨迹球控件
function initControls(){
    controls = new THREE.OrbitControls(camera, renderer.domElement);
    controls.enableDamping = true;
    controls.dampingFactor = 0.5;
    controls.minDistance = 2;
    // 视角最远距离
    controls.maxDistance = 5000;
    // 最大角度
    controls.maxPolarAngle = Math.PI / 2.2;
}

function initGui(){
    options = new function (){
        this.selectObj = "";
        this.startMove = function () {
            scene.add(gridHelper);
            scene.add(rollOverMesh);
            document.addEventListener('mousemove', onDocumentMouseMove, false);
            document.addEventListener('mousedown', onDocumentMouseDown, false);
        }
        this.endMove = function () {
            scene.remove(gridHelper);
            scene.remove(rollOverMesh);
            document.addEventListener("mousemove", onDocumentMouseMove, false);
            document.addEventListener('mousedown', onDocumentMouseDown, false);
        }
    }
    
    var gui = new dat.GUI();
    gui.domElement.style = 'position:absolute;top:50px;left:0px;height:600px';
    gui.add(options, 'selectObj').name("选中的物体:").listen();
    gui.add(options, 'startMove').name("进入编辑模式").listen();
    gui.add(options, 'endMove').name("退出编辑模式:").listen();
}

function onWindowResize() {
    camera.aspect = window.innerWidth / window.innerHeight;
    camera.updateProjectionMatrix();
    renderer.setSize( window.innerWidth, window.innerHeight );
}

function onDocumentMouseMove( event ) {
    event.preventDefault();
    mouse.set( ( event.clientX / window.innerWidth ) * 2 - 1, - ( event.clientY / window.innerHeight ) * 2 + 1 );
    raycaster.setFromCamera( mouse, camera );
    var intersects = raycaster.intersectObjects( objects );
    if ( intersects.length > 0 ) {
        var intersect = intersects[ 0 ];
        rollOverMesh.position.copy( intersect.point ).add( intersect.face.normal );
        rollOverMesh.position.divideScalar( 50 ).floor().multiplyScalar( 50 ).addScalar( 25 );
    }
    renderer.render(scene, camera);
}

function onDocumentMouseDown( event ) {
    event.preventDefault();
    mouse.set( ( event.clientX / window.innerWidth ) * 2 - 1, - ( event.clientY / window.innerHeight ) * 2 + 1 );
    raycaster.setFromCamera( mouse, camera );
    var intersects = raycaster.intersectObjects( objects );
    if ( intersects.length > 0 ) {
        var intersect = intersects[ 0 ];
        selectobject[0].position.copy( intersect.point ).add( intersect.face.normal );
        selectobject[0].position.divideScalar( 50 ).floor().multiplyScalar( 50 ).addScalar( 25 );
        renderer.render(scene, camera);
    }
}

function animate() {
    requestAnimationFrame(animate);
    renderer.render(scene, camera);
    composer.render();
    update();
}

// 更新控件
function update() {
    stats.update();
    controls.update();
}

function init(){
    
    initScene();
    initCamera();
    initLight();
    initRenderer();
    initControls();
    initGui();

    var rollOverGeo = new THREE.BoxBufferGeometry(50, 50, 50);
    rollOverMaterial = new THREE.MeshBasicMaterial( { color: 0x00BFFF, opacity: 0.5, transparent: true } );
    rollOverMesh = new THREE.Mesh( rollOverGeo, rollOverMaterial );

    gridHelper = new THREE.GridHelper(2000, 40);

// cubes
    cubeGeo = new THREE.BoxBufferGeometry(50, 50, 50);
    cubeMaterial = new THREE.MeshLambertMaterial({color: 0xfeb74c});

    var voxel = new THREE.Mesh(cubeGeo, cubeMaterial);
    voxel.position.set(25, 25, 25);
    voxel.name = "货物$1";
    scene.add(voxel);
    objects.push(voxel);
    
    var voxel2 = voxel.clone();
    voxel2.position.set(225, 25, 25);
    voxel2.name = "货物$2";
    scene.add(voxel2);
    objects.push(voxel2);
    
    var voxel3 = voxel.clone();
    voxel3.position.set(-225, 25, 25);
    voxel3.name = "货物$3";
    scene.add(voxel3);
    objects.push(voxel3);
    
    raycaster = new THREE.Raycaster();
    mouse = new THREE.Vector2();
    
    window.addEventListener('resize', onWindowResize, false);

    //添加选中时的蒙版
    composer = new THREE.ThreeJs_Composer(renderer, scene, camera, options, selectobject);
    
    animate();
}