package com._6core.platform.warehouse.boot;

import com._6core.lib.java.MicroserviceLogger;

public class TestLogger {
    private static final MicroserviceLogger logger = new MicroserviceLogger();

    public static void main(String[] args) {
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
    }
}
