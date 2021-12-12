package com.ss.file.main;

import com.ss.dao.AbstractDaoProcessor;
import com.ss.file.AbstractFileProcessor;
import com.ss.file.TxtFileProcessor;
import com.ss.file.WordFileProcessor;
import com.ss.main.Lifecycle;

public class FileModularity implements Lifecycle {

    private AbstractFileProcessor[] fileProcessor;

    private AbstractDaoProcessor fileDaoProcessor;




    @Override
    public void init() {
        fileProcessor = new AbstractFileProcessor[2];
        fileProcessor[0] = new TxtFileProcessor();
        fileProcessor[1] = new WordFileProcessor();

        fileDaoProcessor.init();

    }

    @Override
    public void destroy() {
        fileProcessor = null;
        fileDaoProcessor = null;
    }
}
