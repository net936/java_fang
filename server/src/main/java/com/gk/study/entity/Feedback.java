package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("b_feedback")
public class Feedback implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String title; // 标题
    @TableField
    public String content; // 内容
    @TableField
    public String name; // 姓名
    @TableField
    public String email; // 邮箱
    @TableField
    public String mobile; // 手机号

}
