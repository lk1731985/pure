package com.demo2.service;

import com.demo2.entity.Userinfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author demo2
 * @since 2024-01-01
 */
public interface UserinfoService extends IService<Userinfo> {


    List<Userinfo> xmltest();
    List<String> xmltest1();
    List<String> xmltest2();
}
