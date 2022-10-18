package org.snorri.devannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author  Denys Shabelnyk
 * @since 1.0
 * An annotation for mark class,method,field which ready to commit in CVS
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ReadyToCommit {
}
