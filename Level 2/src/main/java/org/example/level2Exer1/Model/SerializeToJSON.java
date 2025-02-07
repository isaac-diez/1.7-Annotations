package org.example.level2Exer1.Model;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SerializeToJSON {
    String path();
}
