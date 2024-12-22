package com.example;

import org.apache.log4j.Logger;

public class TestLog4j {
    private static final Logger logger = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) {
        logger.info("Log4j is working!");
    }
}
