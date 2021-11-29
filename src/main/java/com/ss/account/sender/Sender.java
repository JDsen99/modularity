package com.ss.account.sender;

public interface Sender {

    //发送消息
    boolean sendMessage(String account, String message);

    //发送内容
    boolean sendVerifyCode(String account,String code);

    //内容验证
    boolean checkContent(String content);
}
