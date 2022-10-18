package org.snorri.devannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author  Denys Shabelnyk
 * @since 1.0
 * An annotation for mark a method which has modified recently
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Modifycodemethod {
}
