package com.xiaoming.dao;

import com.xiaoming.model.Cameras;
import com.xiaoming.model.CamerasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CamerasMapper {
    long countByExample(CamerasExample example);

    int deleteByExample(CamerasExample example);

    int deleteByPrimaryKey(Integer cameraId);

    int insert(Cameras record);

    int insertSelective(Cameras record);

    List<Cameras> selectByExample(CamerasExample example);

    Cameras selectByPrimaryKey(Integer cameraId);

    int updateByExampleSelective(@Param("record") Cameras record, @Param("example") CamerasExample example);

    int updateByExample(@Param("record") Cameras record, @Param("example") CamerasExample example);

    int updateByPrimaryKeySelective(Cameras record);

    int updateByPrimaryKey(Cameras record);
}