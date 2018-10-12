package com.zhx.springcloud.demoribbonuser;

import com.zhx.springcloud.demoribbonuser.mapper.UserPhoneMapper;
import org.junit.Test;

import javax.annotation.Resource;

public class ZhxTest extends DemoRibbonUserApplicationTests {
    @Resource
    private UserPhoneMapper userPhoneMapper;

    @Test
    public void testSelect(){
        System.out.println(userPhoneMapper.getUpdateTimeById("1"));
    }
}
