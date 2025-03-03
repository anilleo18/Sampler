package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.my_enumerations.TestCaseType;

/**
 * CustomFrameworkAnnotations to create custom annotations for the Tests
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomFrameworkAnnotations {

    TestCaseType testCaseType();
}
