package com.xiaoming.service.Impl;

import com.xiaoming.dao.MyLightMapper;
import com.xiaoming.model.MyLight;
import com.xiaoming.model.MyLightExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("LightService")
public class LightServiceImpl {
    
    @Resource
    private MyLightMapper lightMapper;
    
    /**
     * 根据 sceneID 获取 光源信息
     */
    public List<MyLight> getLightBySceneID(Integer sceneID){
        MyLightExample example = new MyLightExample();
        MyLightExample.Criteria criteria = example.createCriteria();
        criteria.andSceneIdEqualTo(sceneID);
        return lightMapper.selectByExample(example);
    }

    public MyLight getLightById(Integer lightId) {
        return lightMapper.selectByPrimaryKey(lightId);
    }
    
    public int insertSelectiveLight(MyLight light){
        return lightMapper.insertSelective(light);
    }
    
    
}
