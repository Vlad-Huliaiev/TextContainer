package com.gmail.gulyaev4420;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface SaveTo {
    String path();
}
