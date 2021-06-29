package com.github.fredyspt.ecommerce.model;

import com.github.fredyspt.ecommerce.util.Constant;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Product {
    private static int counter;
    private final int id;
    private String name;
    private String description;
    private String brand;
    private ProductSize size;
    private String color;
    private int price;

    public Product(Map<String, Object> dict){
        id = counter++;

        if (dict.containsKey(Constant.KEY_NAME)) {
            this.setName((String) dict.get(Constant.KEY_NAME));
        }

        if (dict.containsKey(Constant.KEY_DESCRIPTION)) {
            this.setDescription((String) dict.get(Constant.KEY_DESCRIPTION));
        }

        if (dict.containsKey(Constant.KEY_BRAND)) {
            this.setBrand((String) dict.get(Constant.KEY_BRAND));
        }

        if (dict.containsKey(Constant.KEY_SIZE)) {
            this.setSize((String) dict.get(Constant.KEY_SIZE));
        }

        if (dict.containsKey(Constant.KEY_COLOR)) {
            this.setColor((String) dict.get(Constant.KEY_COLOR));
        }

        if (dict.containsKey(Constant.KEY_PRICE)) {
            this.setPrice((Integer) dict.get(Constant.KEY_PRICE));
        }
    }

    public static Product getProductById(int id, ArrayList<Product> products){
        Product selectedProduct = null;
        for(Product product : products){
            if(product.getId() == id){
                selectedProduct = product;
            }
        }

        return selectedProduct;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(String size) {
        size = size.toUpperCase();
        switch (size){
            case "XS":
                this.size = ProductSize.XS;
                break;
            case "S":
                this.size = ProductSize.S;
                break;
            case "M":
                this.size = ProductSize.M;
                break;
            case "L":
                this.size = ProductSize.L;
                break;
            case "XL":
                this.size = ProductSize.XL;
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static ArrayList<Product> getGirlsProducts(){
        Map<String, Object> product1 = new TreeMap<>();
        product1.put(Constant.KEY_NAME, "2-piece cotton set");
        product1.put(Constant.KEY_DESCRIPTION, "Set with top and shorts in soft cotton jersey " +
                "with a printed design. Top with dropped shoulders and short sleeves with olán. " +
                "Matching shorts with soft elastic at the waist.");
        product1.put(Constant.KEY_BRAND, "H&M");
        product1.put(Constant.KEY_SIZE, "S");
        product1.put(Constant.KEY_COLOR, "Beige");
        product1.put(Constant.KEY_PRICE, 299);

        Map<String, Object> product2 = new TreeMap<>();
        product2.put(Constant.KEY_NAME, "2-piece cotton set v2");
        product2.put(Constant.KEY_DESCRIPTION, "Set with shorts overalls and cotton shirt. " +
                "Shorts in washed twill with buttons to the top and straps with " +
                "knot detail to the front. Pockets on the side seams and a pocket " +
                "on the back. Knitted shirt with narrow border around the neck and short puffed sleeves.");
        product2.put(Constant.KEY_BRAND, "H&M");
        product2.put(Constant.KEY_SIZE, "M");
        product2.put(Constant.KEY_COLOR, "Green");
        product2.put(Constant.KEY_PRICE, 399);

        Map<String, Object> product3 = new TreeMap<>();
        product3.put(Constant.KEY_NAME, "Set of 2 pieces");
        product3.put(Constant.KEY_DESCRIPTION, "Kids Exclusive. Set with jumpsuit dress and knitted top." +
                " Lightweight denim dress with crossover straps at the back, elastic at " +
                "the back of the waist and gathered seams on the skirt to create volume. " +
                "Knit top with narrow edge around the neckline and voluminous woven " +
                "sleeves lined with knit for maximum support.");
        product3.put(Constant.KEY_BRAND, "H&M");
        product3.put(Constant.KEY_SIZE, "M");
        product3.put(Constant.KEY_COLOR, "Blue");
        product3.put(Constant.KEY_PRICE, 699);

        Map<String, Object> product4 = new TreeMap<>();
        product4.put(Constant.KEY_NAME, "Set of 2 pieces flowers");
        product4.put(Constant.KEY_DESCRIPTION, "Set with strappy top and skirt in viscose fabric. " +
                "Top with smock stitch, straight cut at the neck, narrow straps and flared peplum. " +
                "Skirt with smock stitch on the top and olán seam on the hem.");
        product4.put(Constant.KEY_BRAND, "H&M");
        product4.put(Constant.KEY_SIZE, "L");
        product4.put(Constant.KEY_COLOR, "Blue");
        product4.put(Constant.KEY_PRICE, 499);

        Map<String, Object> product5 = new TreeMap<>();
        product5.put(Constant.KEY_NAME, "Striped 2-piece set");
        product5.put(Constant.KEY_DESCRIPTION, "Set with sleeveless top and knitted pants. " +
                "Ribbed top with a narrow cut on top. Ankle-length trousers with lined elastic " +
                "at the waist and wide, straight-cut legs.");
        product5.put(Constant.KEY_BRAND, "H&M");
        product5.put(Constant.KEY_SIZE, "L");
        product5.put(Constant.KEY_COLOR, "Yellow");
        product5.put(Constant.KEY_PRICE, 399);


        ArrayList<Product> dummyProducts = new ArrayList<>();
        dummyProducts.add(new Product(product1));
        dummyProducts.add(new Product(product2));
        dummyProducts.add(new Product(product3));
        dummyProducts.add(new Product(product4));
        dummyProducts.add(new Product(product5));

        return dummyProducts;
    }
}
