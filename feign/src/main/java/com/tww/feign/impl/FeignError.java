package com.tww.feign.impl;

import com.tww.entity.Student;
import com.tww.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component("FeignError")
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
