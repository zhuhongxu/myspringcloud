package com.zhx.springcloud.demoribboncar.mapper;

import com.zhx.springcloud.demoribboncar.entity.GpsInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface GpsInfoMapper {
    int insert(GpsInfo record);

    int insertSelective(GpsInfo record);

    GpsInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GpsInfo record);

    int updateByPrimaryKey(GpsInfo record);

    @Select("select update_time from ct_gps_info where id = #{id}")
    Date selectById(@Param("id") String id);
}