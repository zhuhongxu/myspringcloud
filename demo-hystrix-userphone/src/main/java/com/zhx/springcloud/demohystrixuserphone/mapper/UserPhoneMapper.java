package com.zhx.springcloud.demohystrixuserphone.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface UserPhoneMapper {

    @Select("select update_time from t_user_phone where id = #{id}")
    Date getUpdateTimeById(@Param("id") String id);
}
