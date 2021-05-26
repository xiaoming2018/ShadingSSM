package com.xiaoming.dao;

import com.xiaoming.model.MyCamera;
import com.xiaoming.model.MyCameraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyCameraMapper {
    long countByExample(MyCameraExample example);

    int deleteByExample(MyCameraExample example);

    int deleteByPrimaryKey(Integer cameraId);

    int insert(MyCamera record);

    int insertSelective(MyCamera record);

    List<MyCamera> selectByExample(MyCameraExample example);

    MyCamera selectByPrimaryKey(Integer cameraId);

    int updateByExampleSelective(@Param("record") MyCamera record, @Param("example") MyCameraExample example);

    int updateByExample(@Param("record") MyCamera record, @Param("example") MyCameraExample example);

    int updateByPrimaryKeySelective(MyCamera record);

    int updateByPrimaryKey(MyCamera record);
}