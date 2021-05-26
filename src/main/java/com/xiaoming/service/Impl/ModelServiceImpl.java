package com.xiaoming.service.Impl;

import com.xiaoming.dao.MyModelMapper;
import com.xiaoming.model.MyModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 模型 service
 */
@Service("ModelsService")
public class ModelServiceImpl {

    @Resource
    private MyModelMapper modelMapper;

    // 插入model
    public int insertSelectiveModel(MyModel model){
        return modelMapper.insertSelective(model);
    }
    
}
