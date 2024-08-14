package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Data
@TableName("b_thing")
public class Thing implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String title;
    @TableField
    public String cover; // 封面
    @TableField
    public String description; // 描述
    @TableField
    public String status; // 状态
    @TableField
    public String createTime; // 时间
    @TableField
    public String score;
    @TableField
    public String price; // 售价
    @TableField
    public String pricer;
    @TableField
    public String huxing; // 户型
    @TableField
    public String mianji; // 面积
    @TableField
    public String mianjir;
    @TableField
    public String location; // 地区
    @TableField
    public String xiaoqu; // 小区
    @TableField
    public String louceng; // 楼层
    @TableField
    public String fangling; // 房龄
    @TableField
    public String chanquan; // 产权
    @TableField
    public String jungong; // 竣工时间
    @TableField
    public String zhuangxiu; // 装修类型
    @TableField
    public String xsxm; // 销售姓名
    @TableField
    public String xssj; //  销售手机
    @TableField
    public String pv;
    @TableField
    public String rate;
    @TableField
    public String recommendCount;
    @TableField
    public String wishCount; // 点赞数
    @TableField
    public String collectCount;  // 收藏数
    @TableField
    public Long classificationId;

    @TableField(exist = false)
    public List<Long> tags; // 标签

    @TableField(exist = false)
    public MultipartFile imageFile;

    @TableField
    public String userId;
}
