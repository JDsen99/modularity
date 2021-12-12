package com.ss.dao;

import com.ss.pojo.User;

public class UserDaoProcessor extends AbstractDaoProcessor<User>{
    @Override
    protected boolean insert(User user, boolean isTransaction) {
        return false;
    }

    @Override
    protected boolean update(User user, boolean isTransaction) {
        return false;
    }

    @Override
    protected boolean delete(User user, boolean isTransaction) {
        return false;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
