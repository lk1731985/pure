package com.demo2.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo2.common.QueryPageParam;
import com.demo2.common.Result;
import com.demo2.entity.Userinfo;
import com.demo2.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author demo2
 * @since 2024-01-01
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("/getall")
    public Result findall(){
        return Result.suc(userinfoService.list(),(long)userinfoService.list().size());
    }

    //增
    @PostMapping("/save")
    public Boolean save(@RequestBody Userinfo userinfo){
        return userinfoService.save(userinfo);
    }

    //删
    @GetMapping("/remove")
    public Boolean remove(Integer id){
        return userinfoService.removeById(id);
    }

    //改
    @PostMapping("/mod")
    public Boolean mod(@RequestBody Userinfo userinfo){
        return userinfoService.updateById(userinfo);
    }
    @PostMapping("/saveormod")
    public Boolean saveormod(@RequestBody Userinfo userinfo){
        return userinfoService.saveOrUpdate(userinfo);
    }


    //模糊查询
    @PostMapping("/listbyname")
    public List<Userinfo> listbyname(@RequestBody Userinfo userinfo){
        LambdaQueryWrapper<Userinfo> lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Userinfo::getName,userinfo.getName());
//        lambdaQueryWrapper.eq(Userinfo::getName,userinfo.getName());
        return userinfoService.list(lambdaQueryWrapper);
    }

    @PostMapping("/listpage1")
//    public List<Userinfo> listpage(@RequestBody HashMap map){
    public List<Userinfo> listpage1(@RequestBody QueryPageParam queryPageParam){
        System.out.println("queryPageParam = " + queryPageParam);
//        LambdaQueryWrapper<Userinfo> lambdaQueryWrapper=new LambdaQueryWrapper();
//        lambdaQueryWrapper.like(Userinfo::getName, userinfo.getName());
////        lambdaQueryWrapper.eq(Userinfo::getName,userinfo.getName());
        return null;
    }

    @PostMapping("/listpage")
    public Result listpage(@RequestBody QueryPageParam queryPageParam){
        //查询参数放进map
        HashMap param=queryPageParam.getParam();
        String name=(String)param.get("name");
        //分页
        Page<Userinfo> page=new Page();
        page.setCurrent(queryPageParam.getPageNum());
        page.setSize(queryPageParam.getPageSize());

        //模糊查询
        LambdaQueryWrapper<Userinfo> lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Userinfo::getName,name);
        IPage result=userinfoService.page(page,lambdaQueryWrapper);
        return Result.suc(result.getRecords(),result.getTotal());
    }

    @GetMapping("/xmltest")
    public List<Userinfo> xmltest(){
        return userinfoService.xmltest();
    }

    @GetMapping("/xmltest1")
    public List<String> xmltest1(){
        return userinfoService.xmltest1();
    }

    @GetMapping("/xmltest2")
    public Result xmltest2(){
        return Result.suc( userinfoService.xmltest2());

    }
}

