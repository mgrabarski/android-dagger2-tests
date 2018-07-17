package com.mateusz.grabarski.dagger2tests.domain.models;

import javax.inject.Inject;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
public class DataGenerator {

    @Inject
    public DataGenerator() {
    }

    public String generateString() {
        return "String message...";
    }
}
