package com.xiaoming.service.Impl;

import com.xiaoming.dao.MyCameraMapper;
import com.xiaoming.model.MyCamera;
import com.xiaoming.model.MyCameraExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cameraService")
public class CameraServiceImpl {
    
    @Resource
    private MyCameraMapper cameraMapper;

    /**
     * 根据 camera SceneID 获取当前场景的相机配置参数
     */
    public List<MyCamera> getCameraBySceneID(Integer sceneID){
        MyCameraExample example = new MyCameraExample();
        MyCameraExample.Criteria criteria = example.createCriteria();
        criteria.andSceneIdEqualTo(sceneID);
        return cameraMapper.selectByExample(example);
    }

    /**
     * add camera
     */
    
    public int insertSelectiveCamera(MyCamera camera){
        return cameraMapper.insertSelective(camera);
    }

    /**
     * get camera by id
     * @param cameraId
     * @return
     */
    public MyCamera getCameraById(Integer cameraId) {
        return cameraMapper.selectByPrimaryKey(cameraId);
    }

    /**
     * update camera
     */
    public int updateCamera(MyCamera camera){
        return cameraMapper.updateByPrimaryKeySelective(camera);
    }

    /**
     *  delete cameta by id 
     */
    public int deleteCameraById(Integer cameraId){
        return cameraMapper.deleteByPrimaryKey(cameraId);
    }
    
}
