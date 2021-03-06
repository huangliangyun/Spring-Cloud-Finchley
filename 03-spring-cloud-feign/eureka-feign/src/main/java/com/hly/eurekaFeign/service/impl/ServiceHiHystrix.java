package com.hly.eurekaFeign.service.impl;

import com.hly.eurekaFeign.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author :hly
 * @github :github.com/SiriusHly
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/10/17
 */
@Component
public class ServiceHiHystrix implements ServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
