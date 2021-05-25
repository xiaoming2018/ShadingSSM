package com.xiaoming.service.Impl;

import com.xiaoming.dao.ModelsMapper;
import com.xiaoming.model.Models;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service("ModelsService")
public class ModelServiceImpl {

    @Resource
    private ModelsMapper modelMapper;

    // 插入
    public int insertSelectiveModel(Models model){
        return modelMapper.insertSelective(model);
    }
    
}
