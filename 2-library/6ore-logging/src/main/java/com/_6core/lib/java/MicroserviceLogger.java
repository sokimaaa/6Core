package com._6core.lib.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface MicroserviceLogger {

    Logger logger = LoggerFactory.getLogger(MicroserviceLogger.class);

    default void debug(String message) {
        logger.debug(message);
    }
    default void info(String message) {
        logger.info(message);
    }

    default void warn(String message) {
        logger.warn(message);
    }

    default void error(String message) {
        logger.error(message);
    }
}
