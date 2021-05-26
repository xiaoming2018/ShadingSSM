package com.xiaoming.service.Impl;

import com.xiaoming.dao.MyModelTypeMapper;
import com.xiaoming.model.MyModelType;
import com.xiaoming.model.MyModelTypeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ModelTypeService")
public class ModelTypeServiceImpl {
    
    @Resource
    private MyModelTypeMapper modelTypeMapper;

    /**
     * 无参
     * @return 所有的模型类型 List 
     */
    public List<MyModelType> selectAll(){
        MyModelTypeExample example = new MyModelTypeExample();
        List<MyModelType> modelTypeList = modelTypeMapper.selectByExample(example);
        return modelTypeList;
    }
    
}
