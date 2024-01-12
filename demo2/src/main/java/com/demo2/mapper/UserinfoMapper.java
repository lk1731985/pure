package com.demo2.mapper;

import com.demo2.entity.Userinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author demo2
 * @since 2024-01-01
 */
@Mapper
public interface UserinfoMapper extends BaseMapper<Userinfo> {

    public List<Userinfo> xmltest();

    public List<String> xmltest1();

    public List<String> xmltest2();
}
