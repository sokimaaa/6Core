package com._6core.lib.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroserviceLogger {
    private static final Logger MICRO_LOGGER
            = LoggerFactory.getLogger(MicroserviceLogger.class);

    public static void debug(String message) {
        MICRO_LOGGER.debug(message);
    }

    public static void info(String message) {
        MICRO_LOGGER.info(message);
    }

    public static void warn(String message) {
        MICRO_LOGGER.warn(message);
    }

    public static void error(String message) {
        MICRO_LOGGER.error(message);
    }
}
