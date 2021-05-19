package com.xiaoming.dao;

import com.xiaoming.model.camera;
import com.xiaoming.model.cameraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cameraMapper {
    long countByExample(cameraExample example);

    int deleteByExample(cameraExample example);

    int deleteByPrimaryKey(Integer cameraId);

    int insert(camera record);

    int insertSelective(camera record);

    List<camera> selectByExample(cameraExample example);

    camera selectByPrimaryKey(Integer cameraId);

    int updateByExampleSelective(@Param("record") camera record, @Param("example") cameraExample example);

    int updateByExample(@Param("record") camera record, @Param("example") cameraExample example);

    int updateByPrimaryKeySelective(camera record);

    int updateByPrimaryKey(camera record);
}