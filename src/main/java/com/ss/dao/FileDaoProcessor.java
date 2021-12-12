package com.ss.dao;

import java.io.File;

public class FileDaoProcessor extends AbstractDaoProcessor<File>{
    @Override
    protected boolean insert(File file, boolean isTransaction) {
        return false;
    }

    @Override
    protected boolean update(File file, boolean isTransaction) {
        return false;
    }

    @Override
    protected boolean delete(File file, boolean isTransaction) {
        return false;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
