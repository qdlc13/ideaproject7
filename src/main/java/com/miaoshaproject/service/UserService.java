package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    //通过缓存获取用户对象
    UserModel getUserByIdInCache(Integer id);

    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;
    /*
    telphone:用户注册手机
    encrptPassowrd:用户加密后的密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
