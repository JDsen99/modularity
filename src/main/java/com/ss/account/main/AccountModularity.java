package com.ss.account.main;

import com.ss.account.sender.MailSender;
import com.ss.account.sender.Sender;
import com.ss.account.verify.MailVerify;
import com.ss.account.verify.Verify;

public class AccountModularity {

    //发送接口 实现
    private Sender sender;

    //验证接口 实现
    private Verify verify;

    public AccountModularity() {
        init();
    }

    private void init() {
        sender = new MailSender();
        verify = new MailVerify();
    }

    private String sendVerifyCode(String account) {
        //TODO 处理逻辑
        String code = "123asd";
        return sender.sendVerifyCode(account,code) ? code : null;
    }

    public boolean verifyAccount(String account) {
        //TODO 处理逻辑
        return verify.verifyAccount(account);
    }
}
