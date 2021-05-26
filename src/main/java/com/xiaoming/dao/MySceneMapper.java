package com.xiaoming.dao;

import com.xiaoming.model.MyScene;
import com.xiaoming.model.MySceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MySceneMapper {
    long countByExample(MySceneExample example);

    int deleteByExample(MySceneExample example);

    int insert(MyScene record);

    int insertSelective(MyScene record);

    List<MyScene> selectByExample(MySceneExample example);

    int updateByExampleSelective(@Param("record") MyScene record, @Param("example") MySceneExample example);

    int updateByExample(@Param("record") MyScene record, @Param("example") MySceneExample example);
}