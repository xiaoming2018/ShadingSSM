package com.xiaoming.dao;

import com.xiaoming.model.ModelTypes;
import com.xiaoming.model.ModelTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelTypesMapper {
    long countByExample(ModelTypesExample example);

    int deleteByExample(ModelTypesExample example);

    int deleteByPrimaryKey(Integer modelTypeId);

    int insert(ModelTypes record);

    int insertSelective(ModelTypes record);

    List<ModelTypes> selectByExample(ModelTypesExample example);

    ModelTypes selectByPrimaryKey(Integer modelTypeId);

    int updateByExampleSelective(@Param("record") ModelTypes record, @Param("example") ModelTypesExample example);

    int updateByExample(@Param("record") ModelTypes record, @Param("example") ModelTypesExample example);

    int updateByPrimaryKeySelective(ModelTypes record);

    int updateByPrimaryKey(ModelTypes record);
}