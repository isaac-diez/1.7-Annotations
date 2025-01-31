package org.main.level2Exer1.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Define cuándo se conserva la anotación
@Target(ElementType.TYPE) // Define dónde se puede aplicar la anotación
public @interface SerializeToJSON {
    String path();
}
