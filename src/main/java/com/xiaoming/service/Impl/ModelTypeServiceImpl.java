package com.xiaoming.service.Impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ModelTypeService")
public class ModelTypeServiceImpl {
    
    @Resource
    private modelTypeMapper modelTypeMapper;

    /**
     * 无参
     * @return 所有的模型类型 List 
     */
    public List<modelType> selectAll(){
        modelTypeExample example = new modelTypeExample();
        List<modelType> modelTypeList = modelTypeMapper.selectByExample(example);
        return modelTypeList;
    }
    
}
