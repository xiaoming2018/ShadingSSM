package com.xiaoming.dao;

import com.xiaoming.model.MyModelType;
import com.xiaoming.model.MyModelTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyModelTypeMapper {
    long countByExample(MyModelTypeExample example);

    int deleteByExample(MyModelTypeExample example);

    int deleteByPrimaryKey(Integer modelTypeId);

    int insert(MyModelType record);

    int insertSelective(MyModelType record);

    List<MyModelType> selectByExample(MyModelTypeExample example);

    MyModelType selectByPrimaryKey(Integer modelTypeId);

    int updateByExampleSelective(@Param("record") MyModelType record, @Param("example") MyModelTypeExample example);

    int updateByExample(@Param("record") MyModelType record, @Param("example") MyModelTypeExample example);

    int updateByPrimaryKeySelective(MyModelType record);

    int updateByPrimaryKey(MyModelType record);
}