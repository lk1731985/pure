package com.demo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author demo2
 * @since 2024-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Userinfo对象", description="")
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String name;

    private Integer age;

    private String sex;

    private String date;

    private String address;

    private Integer userId;

    private String menu;

    private String password;

    private Date updateTime;


}
