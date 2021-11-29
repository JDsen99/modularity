package com.ss.account.sender;

public class MailSender extends AbstractSender{

    @Override
    public boolean sendMessage(String account, String message) {
        checkContent(message);
        System.out.println("send message : " + message);
        return true;
    }

    @Override
    public boolean sendVerifyCode(String account, String code) {
        checkContent(code);
        System.out.println("send verify code : " + code);
        return true;
    }
}
