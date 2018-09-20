package com.server.auth.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/****
 * 数据库中对应的用户属性字段
 */
@Data
@TableName    //后跟tableName
public class User extends Model<User> {//lombak注解生成的set，get

    //用户名

    String user_Name;
    //密码
    String user_Password;
    //编号
    String user_No;

    //id
    Integer id;
    //名字
    String name;
    //年龄
    Integer age;
    //地址
    String address;
    //邮箱
    String email;
    //电话
    String phone;

    //性别
    String sex;
    //当前状态--0离开 1.在职
    Integer status;

    //描述
    String description;

    //额外的其他描述项
    String type;
    String attr;
    String other;


    @Override
    protected Serializable pkVal() {
        return null;
    }
}
