package com.ss.account.sender;

public class AbstractSender implements Sender{
    @Override
    public boolean sendMessage(String account,String message) {
        return false;
    }

    @Override
    public boolean sendVerifyCode(String account,String code) {
        return false;
    }

    @Override
    public boolean checkContent(String content) {
        return content.length() < 200 ;
    }
}
