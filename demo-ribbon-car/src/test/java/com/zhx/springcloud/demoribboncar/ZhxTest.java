package com.zhx.springcloud.demoribboncar;

import com.zhx.springcloud.demoribboncar.mapper.GpsInfoMapper;
import org.junit.Test;

import javax.annotation.Resource;

public class ZhxTest extends DemoRibbonCarApplicationTests {
    @Resource
    private GpsInfoMapper gpsInfoMapper;

    @Test
    public void selectByKey(){
        System.out.println(gpsInfoMapper.selectById("10000"));
    }
}
