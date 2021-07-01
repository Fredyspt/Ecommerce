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
        String filePath = "src/main/java/com/github/fredyspt/ecommerce/util/";
        File file = new File(filePath + jsonFileName);

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
