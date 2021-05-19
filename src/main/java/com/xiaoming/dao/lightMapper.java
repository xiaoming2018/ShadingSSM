package com.xiaoming.dao;

import com.xiaoming.model.light;
import com.xiaoming.model.lightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lightMapper {
    long countByExample(lightExample example);

    int deleteByExample(lightExample example);

    int deleteByPrimaryKey(Integer lightId);

    int insert(light record);

    int insertSelective(light record);

    List<light> selectByExample(lightExample example);

    light selectByPrimaryKey(Integer lightId);

    int updateByExampleSelective(@Param("record") light record, @Param("example") lightExample example);

    int updateByExample(@Param("record") light record, @Param("example") lightExample example);

    int updateByPrimaryKeySelective(light record);

    int updateByPrimaryKey(light record);
}