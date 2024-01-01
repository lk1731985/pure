package com.demo2.common;

import lombok.Data;

@Data
public class Result {
    private int code; //编码
    private String msg; //信息
    private Long total; //总条数
    private Object data; //数据

    public static Result fail(){
        return result(400,"失败",0L,null);
    }
    public static Result suc(){
        return result(200,"成功",0L,null);
    }
    public static Result suc(Object data){
        return result(200,"成功",0L,data);
    }
    public static Result suc(Object data,Long total){
        return result(200,"成功",total,data);
    }
    private  static  Result result(int code,String msg,long total,Object data){
        Result res=new Result();
        res.setCode(code);
        res.setMsg(msg);
        res.setTotal(total);
        res.setData(data);
        return res;
    }
}
