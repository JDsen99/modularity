package com.ss.account.main;

import com.ss.account.sender.Sender;
import com.ss.account.verify.Verify;
import com.ss.main.BaseModularity;
import com.ss.main.Lifecycle;

/**
 * @author Jangs
 * @param <T> 用户类
 */
public abstract class AbstractAccountModularity<T> extends BaseModularity implements Lifecycle {

    //发送接口 实现
    protected Sender sender;

    //验证接口 实现
    protected Verify verify;

    /**
     * 发送 验证码
     * @param account 用户
     * @return String 验证码
     */
    protected abstract String sendVerifyCode(String account) ;

    /**
     * 验证用户是否存在
     * @param account 用户
     * @return boolean 是否存在
     */
    protected abstract boolean verifyAccount(String account);

    /**
     * 登录
     * @return T 用户实体类
     */
    protected abstract T login(String account, String password);

    /**
     * 注册
     * @param t 用户实体类
     */
    protected abstract void register(T t);

    /**
     * 修改个人信息
     * @param t 用户实体类
     */
    protected abstract void updateAccountInfo(T t);

}
