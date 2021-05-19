package com.xiaoming.dao;

import com.xiaoming.model.model;
import com.xiaoming.model.modelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface modelMapper {
    long countByExample(modelExample example);

    int deleteByExample(modelExample example);

    int deleteByPrimaryKey(Integer modelId);

    int insert(model record);

    int insertSelective(model record);

    List<model> selectByExample(modelExample example);

    model selectByPrimaryKey(Integer modelId);

    int updateByExampleSelective(@Param("record") model record, @Param("example") modelExample example);

    int updateByExample(@Param("record") model record, @Param("example") modelExample example);

    int updateByPrimaryKeySelective(model record);

    int updateByPrimaryKey(model record);
}