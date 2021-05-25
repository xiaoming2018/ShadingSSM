package com.xiaoming.dao;

import com.xiaoming.model.Lights;
import com.xiaoming.model.LightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LightsMapper {
    long countByExample(LightsExample example);

    int deleteByExample(LightsExample example);

    int deleteByPrimaryKey(Integer lightId);

    int insert(Lights record);

    int insertSelective(Lights record);

    List<Lights> selectByExample(LightsExample example);

    Lights selectByPrimaryKey(Integer lightId);

    int updateByExampleSelective(@Param("record") Lights record, @Param("example") LightsExample example);

    int updateByExample(@Param("record") Lights record, @Param("example") LightsExample example);

    int updateByPrimaryKeySelective(Lights record);

    int updateByPrimaryKey(Lights record);
}