package com.github.fredyspt.ecommerce.helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fredyspt.ecommerce.model.Product;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadJsonFile {

    public static List<Product> readJson(String jsonFileName) {
        ObjectMapper objMapper = new ObjectMapper();

        // No hay necesidad de definir la ruta completa, Java puede buscar
        // dentro de los archivos de este proyecto
        String filePath = "src/main/java/com/github/fredyspt/ecommerce/util/";
        File file = new File(filePath + jsonFileName);

        // TypeReference le indica al ObjectMapper que los datos que lea de "file"
        // pertenecen al mismo tipo de la variable en donde se almacenaranm, "products",
        // es decir, lo que el objMapper lea de file, sabe que se trata de una lista de productos
        // Se necesita un contructor vacio para que objMapper cree los objetos.
        List<Product> products = null;
        try {
            products = objMapper.readValue(file,
                    new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (products == null) {
            System.out.println("No items in file");
        }

        return products;
    }
}
