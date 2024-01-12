package com.demo2.service.impl;

import com.demo2.entity.Userinfo;
import com.demo2.mapper.UserinfoMapper;
import com.demo2.service.UserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author demo2
 * @since 2024-01-01
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService {
    @Autowired
    UserinfoMapper userinfoMapper;
    public List<Userinfo> xmltest(){
        return  userinfoMapper.xmltest();
    }
    public List<String> xmltest1(){
        return  userinfoMapper.xmltest1();
    }
    public List<String> xmltest2(){
        return  userinfoMapper.xmltest2();
    }
}
