package br.com.inf.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class Log4jTestWatcher extends TestWatcher{

    private final Logger logger;

    public Log4jTestWatcher(Class c) {
        logger = LogManager.getLogger(c);
    }

    public Log4jTestWatcher(String loggerName) {
        logger = LogManager.getLogger(loggerName);
    }

    @Override
    protected void failed(Throwable e, Description description) {
        logger.error(description, e);
    }

    @Override
    protected void succeeded(Description description) {
        logger.info(description);
    }
}
