package com.xiaoming.dao;

import com.xiaoming.model.scene;
import com.xiaoming.model.sceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sceneMapper {
    long countByExample(sceneExample example);

    int deleteByExample(sceneExample example);

    int deleteByPrimaryKey(Integer sceneId);

    int insert(scene record);

    int insertSelective(scene record);

    List<scene> selectByExample(sceneExample example);

    scene selectByPrimaryKey(Integer sceneId);

    int updateByExampleSelective(@Param("record") scene record, @Param("example") sceneExample example);

    int updateByExample(@Param("record") scene record, @Param("example") sceneExample example);

    int updateByPrimaryKeySelective(scene record);

    int updateByPrimaryKey(scene record);
}