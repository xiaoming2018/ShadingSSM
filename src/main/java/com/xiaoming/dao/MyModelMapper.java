package com.xiaoming.dao;

import com.xiaoming.model.MyModel;
import com.xiaoming.model.MyModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyModelMapper {
    long countByExample(MyModelExample example);

    int deleteByExample(MyModelExample example);

    int deleteByPrimaryKey(Integer modelId);

    int insert(MyModel record);

    int insertSelective(MyModel record);

    List<MyModel> selectByExample(MyModelExample example);

    MyModel selectByPrimaryKey(Integer modelId);

    int updateByExampleSelective(@Param("record") MyModel record, @Param("example") MyModelExample example);

    int updateByExample(@Param("record") MyModel record, @Param("example") MyModelExample example);

    int updateByPrimaryKeySelective(MyModel record);

    int updateByPrimaryKey(MyModel record);
}