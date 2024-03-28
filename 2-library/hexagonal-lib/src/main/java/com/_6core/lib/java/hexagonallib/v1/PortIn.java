package com._6core.lib.java.hexagonallib.v1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PortIn describes how our application can be used by others.
 * <p>
 * Applicable for annotating an interface/class that describes incoming interaction,
 * e.g. Controller class.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface PortIn {
}
