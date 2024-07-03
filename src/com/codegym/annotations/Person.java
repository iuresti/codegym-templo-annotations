package com.codegym.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Person {
    String name() default "";

    int live();

    int strength();

    int magic() default 0;

    int attack() default 0;

    int defense();

}
