package com.xiaoming.service.Impl;

import com.xiaoming.dao.ModelTypesMapper;
import com.xiaoming.model.ModelTypes;
import com.xiaoming.model.ModelTypesExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ModelTypeService")
public class ModelTypeServiceImpl {
    
    @Resource
    private ModelTypesMapper modelTypeMapper;

    /**
     * 无参
     * @return 所有的模型类型 List 
     */
    public List<ModelTypes> selectAll(){
        ModelTypesExample example = new ModelTypesExample();
        List<ModelTypes> modelTypeList = modelTypeMapper.selectByExample(example);
        return modelTypeList;
    }
    
}
