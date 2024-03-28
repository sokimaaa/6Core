package com._6core.lib.java.hexagonallib.v1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PortOut describes how our application can use other application/service.
 * <p>
 * Applicable for annotating an interface/class that describes outgoing interaction,
 * e.g. interaction with DB layer (repository).
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface PortOut {
}
