package org.main.level2Exer1.Model;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;

public class SerializerToJSON {
    public static void serialize(Object object) throws Exception {
        // Obtenemos la clase del objeto
        Class<?> objectClass = object.getClass();

        // Verificamos si tiene anotación @SerializableToJson
        if (!objectClass.isAnnotationPresent(SerializeToJSON.class)) {
            throw new IllegalArgumentException("The class doesn't have the annotation @SerializableToJson");
        }

        // Obtenemos el path del directorio a través de la anotación
        SerializeToJSON annotation = objectClass.getAnnotation(SerializeToJSON.class);
        String directory = annotation.path();

        // Creamos el contenido del JSON
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");

        Field[] fields = objectClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true); // Permite el acceso a campos privados
            String fieldName = fields[i].getName();
            Object fieldValue = fields[i].get(object);

            jsonBuilder.append("  \"" + fieldName + "\": ");

            // Verificamos el tipo de dato para poner "" o no
            if (fieldValue instanceof String) {
                jsonBuilder.append("\"" + fieldValue + "\"");
            } else {
                jsonBuilder.append(fieldValue);
            }

            if (i < fields.length - 1) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\n");
        }

        jsonBuilder.append("}");

        // Creamos archivo y escribimos el JSON en directorio pasado por atributo
        File fileToWriteJSON = new File(directory + "/" + objectClass.getSimpleName() + ".json");
        try (FileWriter writer = new FileWriter(fileToWriteJSON)) {
            writer.write(jsonBuilder.toString());
        }

        System.out.println("Serialize object in: " + fileToWriteJSON.getAbsolutePath());
    }
}

