package com.pluralsight.sakila.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Loggable {
    protected final Logger logger = LogManager.getLogger(getClass());
}
