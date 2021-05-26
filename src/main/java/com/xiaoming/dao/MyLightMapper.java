package com.xiaoming.dao;

import com.xiaoming.model.MyLight;
import com.xiaoming.model.MyLightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyLightMapper {
    long countByExample(MyLightExample example);

    int deleteByExample(MyLightExample example);

    int deleteByPrimaryKey(Integer lightId);

    int insert(MyLight record);

    int insertSelective(MyLight record);

    List<MyLight> selectByExample(MyLightExample example);

    MyLight selectByPrimaryKey(Integer lightId);

    int updateByExampleSelective(@Param("record") MyLight record, @Param("example") MyLightExample example);

    int updateByExample(@Param("record") MyLight record, @Param("example") MyLightExample example);

    int updateByPrimaryKeySelective(MyLight record);

    int updateByPrimaryKey(MyLight record);
}