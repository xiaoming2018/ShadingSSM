package com.xiaoming.dao;

import com.xiaoming.model.Scenes;
import com.xiaoming.model.ScenesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenesMapper {
    long countByExample(ScenesExample example);

    int deleteByExample(ScenesExample example);

    int deleteByPrimaryKey(Integer sceneId);

    int insert(Scenes record);

    int insertSelective(Scenes record);

    List<Scenes> selectByExample(ScenesExample example);

    Scenes selectByPrimaryKey(Integer sceneId);

    int updateByExampleSelective(@Param("record") Scenes record, @Param("example") ScenesExample example);

    int updateByExample(@Param("record") Scenes record, @Param("example") ScenesExample example);

    int updateByPrimaryKeySelective(Scenes record);

    int updateByPrimaryKey(Scenes record);
}