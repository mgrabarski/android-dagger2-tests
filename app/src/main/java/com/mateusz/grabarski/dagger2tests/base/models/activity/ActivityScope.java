package com.mateusz.grabarski.dagger2tests.base.models.activity;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
