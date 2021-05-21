package com.xiaoming.service.Impl;

import com.xiaoming.dao.modelMapper;
import com.xiaoming.model.model;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service("ModelService")
public class ModelServiceImpl {

    @Resource
    private modelMapper modelMapper;

    public int insertSelectiveModel(model model){
        return modelMapper.insertSelective(model);
    }

}
