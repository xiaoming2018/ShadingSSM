package com.xiaoming.service.Impl;

import com.xiaoming.dao.MyModelMapper;
import com.xiaoming.model.MyModel;
import com.xiaoming.model.MyModelExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 模型 service
 */
@Service("ModelsService")
public class ModelServiceImpl {

    @Resource
    private MyModelMapper modelMapper;

    // 插入 模型
    public int insertSelectiveModel(MyModel model){
        return modelMapper.insertSelective(model);
    }
    
    // 根据 sceneId 获取
    public List<MyModel> getModelBySceneID(Integer sceneID){
        MyModelExample example = new MyModelExample();
        MyModelExample.Criteria criteria= example.createCriteria();
        criteria.andSceneIdEqualTo(sceneID);
        return modelMapper.selectByExample(example);
    }
    
}
