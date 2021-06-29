package com.github.fredyspt.ecommerce.helper;

import com.github.fredyspt.ecommerce.model.Product;
import com.github.fredyspt.ecommerce.util.Constant;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ProductsData {

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


        return addProductsToList(product1, product2, product3, product4, product5);
    }

    public static ArrayList<Product> getBoysProducts(){
        Map<String, Object> product1 = new TreeMap<>();
        product1.put(Constant.KEY_NAME, "4-piece linen set");
        product1.put(Constant.KEY_DESCRIPTION, "Set with linen and cotton vest and shorts, " +
                "cotton poplin shirt and pre-tied bow tie. Vest lined with buttons and decorative " +
                "pockets on the front. Knee-length shorts with adjustable elastic waist, " +
                "zip and button fastening, diagonal side pockets and welt pockets at the back. " +
                "Shirt with English collar, buttons at the front, short sleeves with stitched " +
                "fold and rounded hem. Borrowed bow tie with adjustable elastic and plastic closure.");
        product1.put(Constant.KEY_BRAND, "H&M");
        product1.put(Constant.KEY_SIZE, "XS");
        product1.put(Constant.KEY_COLOR, "Beige");
        product1.put(Constant.KEY_PRICE, 699);

        Map<String, Object> product2 = new TreeMap<>();
        product2.put(Constant.KEY_NAME, "2 piece set");
        product2.put(Constant.KEY_DESCRIPTION, "Set with slightly oversized sweatshirt and " +
                "joggers in cotton blend sweatshirt fabric with a washed appearance. " +
                "Sweatshirt with raglan sleeves, a kangaroo pocket, and ribbed trim around" +
                " the neck, cuffs and hem. Joggers with elastic waist, drawstring, patch pockets" +
                " and lined elastic at the hem. Soft brushed interior.");
        product2.put(Constant.KEY_BRAND, "H&M");
        product2.put(Constant.KEY_SIZE, "S");
        product2.put(Constant.KEY_COLOR, "Blue");
        product2.put(Constant.KEY_PRICE, 429);

        Map<String, Object> product3 = new TreeMap<>();
        product3.put(Constant.KEY_NAME, "Shirt and tie/bow");
        product3.put(Constant.KEY_DESCRIPTION, "Short-sleeved cotton shirt with tie/bow. " +
                "Shirt with a classic collar, buttons at the front, a yoke with pleats at the " +
                "back and a rounded hem. Tie/bow in woven fabric with elastic.");
        product3.put(Constant.KEY_BRAND, "H&M");
        product3.put(Constant.KEY_SIZE, "M");
        product3.put(Constant.KEY_COLOR, "White");
        product3.put(Constant.KEY_PRICE, 299);

        Map<String, Object> product4 = new TreeMap<>();
        product4.put(Constant.KEY_NAME, "T-shirt and shorts");
        product4.put(Constant.KEY_DESCRIPTION, "Soft cotton T-shirt and shorts set. Knitted " +
                "shirt with printed design on the front. Fabric shorts with elastic drawstring " +
                "at the waist, side pockets and a pocket on the back.");
        product4.put(Constant.KEY_BRAND, "H&M");
        product4.put(Constant.KEY_SIZE, "L");
        product4.put(Constant.KEY_COLOR, "Beige");
        product4.put(Constant.KEY_PRICE, 329);

        Map<String, Object> product5 = new TreeMap<>();
        product5.put(Constant.KEY_NAME, "Two-piece cotton set");
        product5.put(Constant.KEY_DESCRIPTION, "Set with short-sleeved shirt and shorts in " +
                "cotton fabric. Shirt with classic collar, buttons at the front, small " +
                "embroidered detail on the top and rounded hem. Knee-length shorts with " +
                "adjustable elastic waist, button zipper closure, side pockets and a " +
                "decorative back pocket.");
        product5.put(Constant.KEY_BRAND, "H&M");
        product5.put(Constant.KEY_SIZE, "XL");
        product5.put(Constant.KEY_COLOR, "Beige/Blue");
        product5.put(Constant.KEY_PRICE, 499);


        return addProductsToList(product1, product2, product3, product4, product5);
    }

    public static ArrayList<Product> getMenProducts(){
        Map<String, Object> product1 = new TreeMap<>();
        product1.put(Constant.KEY_NAME, "Linen bomber jacket");
        product1.put(Constant.KEY_DESCRIPTION, "Linen bomber jacket with slightly high neckline " +
                "and front zipper. Side zip pockets, one inside pocket and ribbed trim around the " +
                "cuffs and hem. Lined.");
        product1.put(Constant.KEY_BRAND, "H&M");
        product1.put(Constant.KEY_SIZE, "XS");
        product1.put(Constant.KEY_COLOR, "Beige");
        product1.put(Constant.KEY_PRICE, 749);

        Map<String, Object> product2 = new TreeMap<>();
        product2.put(Constant.KEY_NAME, "Regular Fit shirt with linen");
        product2.put(Constant.KEY_DESCRIPTION, "Shirt in linen and cotton fabric. Model with " +
                "an English collar, a classic front and a yoke on the back. One open top pocket, " +
                "long sleeves with button band and button cuffs. Rounded hem. Regular Fit - " +
                "classic cut with a slightly adjusted waist for freedom of movement and a sleek, " +
                "comfortable silhouette.");
        product2.put(Constant.KEY_BRAND, "H&M");
        product2.put(Constant.KEY_SIZE, "S");
        product2.put(Constant.KEY_COLOR, "Green");
        product2.put(Constant.KEY_PRICE, 399);

        Map<String, Object> product3 = new TreeMap<>();
        product3.put(Constant.KEY_NAME, "Joggers Regular Fit");
        product3.put(Constant.KEY_DESCRIPTION, "Linen and cotton joggers with lined elastic " +
                "and drawstring at the waist. Model with diagonal side pockets, welt pockets at " +
                "the back and lined elastic at the hem. Regular Fit - classic cut with good " +
                "freedom of movement on thighs and knees to create a straight and comfortable silhouette.");
        product3.put(Constant.KEY_BRAND, "H&M");
        product3.put(Constant.KEY_SIZE, "M");
        product3.put(Constant.KEY_COLOR, "Blue");
        product3.put(Constant.KEY_PRICE, 449);

        Map<String, Object> product4 = new TreeMap<>();
        product4.put(Constant.KEY_NAME, "Regular Fit Hoodie");
        product4.put(Constant.KEY_DESCRIPTION, "Lightweight sweatshirt with a zipper at the front, " +
                "a double-layer hat with a drawstring, side pockets, and a ribbed edge at the " +
                "cuffs and hem.");
        product4.put(Constant.KEY_BRAND, "H&M");
        product4.put(Constant.KEY_SIZE, "L");
        product4.put(Constant.KEY_COLOR, "Black");
        product4.put(Constant.KEY_PRICE, 449);

        Map<String, Object> product5 = new TreeMap<>();
        product5.put(Constant.KEY_NAME, "3-pack of Slim Fit T-shirts");
        product5.put(Constant.KEY_DESCRIPTION, "Soft cotton crew neck T-shirts.");
        product5.put(Constant.KEY_BRAND, "H&M");
        product5.put(Constant.KEY_SIZE, "XL");
        product5.put(Constant.KEY_COLOR, "Mix");
        product5.put(Constant.KEY_PRICE, 499);


        return addProductsToList(product1, product2, product3, product4, product5);
    }

    public static ArrayList<Product> getWomenProducts(){
        Map<String, Object> product1 = new TreeMap<>();
        product1.put(Constant.KEY_NAME, "Mom Loose-fit trousers");
        product1.put(Constant.KEY_DESCRIPTION, "Five-pocket twill ankle-length trousers. " +
                "Loose-fitting model, high waist, zip and button closure, and legs that are " +
                "closer to the ankles.");
        product1.put(Constant.KEY_BRAND, "H&M");
        product1.put(Constant.KEY_SIZE, "XS");
        product1.put(Constant.KEY_COLOR, "Black");
        product1.put(Constant.KEY_PRICE, 329);

        Map<String, Object> product2 = new TreeMap<>();
        product2.put(Constant.KEY_NAME, "Linen-blend skirt");
        product2.put(Constant.KEY_DESCRIPTION, "Short, fitted skirt in linen and viscose " +
                "fabric. High-waisted model with a hidden side zipper and a short opening on " +
                "one side at the front. Lined.");
        product2.put(Constant.KEY_BRAND, "H&M");
        product2.put(Constant.KEY_SIZE, "S");
        product2.put(Constant.KEY_COLOR, "White");
        product2.put(Constant.KEY_PRICE, 449);

        Map<String, Object> product3 = new TreeMap<>();
        product3.put(Constant.KEY_NAME, "Leather sandals");
        product3.put(Constant.KEY_DESCRIPTION, "Soft leather sandals with a square design " +
                "and padded straps with knot detail to the front. Leather lining and insoles. " +
                "Heel 1.6 cm.");
        product3.put(Constant.KEY_BRAND, "H&M");
        product3.put(Constant.KEY_SIZE, "M");
        product3.put(Constant.KEY_COLOR, "Beige");
        product3.put(Constant.KEY_PRICE, 999);

        Map<String, Object> product4 = new TreeMap<>();
        product4.put(Constant.KEY_NAME, "Fitted jacket");
        product4.put(Constant.KEY_DESCRIPTION, "Single-breasted jacket in woven fabric with " +
                "a slightly fitted waist. Notch lapels, welt pockets with flaps at the front, " +
                "decorative buttons at the cuffs and a single opening at the back. Lined. " +
                "Garment partially made from recycled polyester.");
        product4.put(Constant.KEY_BRAND, "H&M");
        product4.put(Constant.KEY_SIZE, "L");
        product4.put(Constant.KEY_COLOR, "Mint");
        product4.put(Constant.KEY_PRICE, 749);

        Map<String, Object> product5 = new TreeMap<>();
        product5.put(Constant.KEY_NAME, "Sleeveless ribbed top");
        product5.put(Constant.KEY_DESCRIPTION, "Sleeveless crop top in cotton jersey with ribbed " +
                "design. Model with a fitted and narrow cut on the upper part with a crossed back.");
        product5.put(Constant.KEY_BRAND, "H&M");
        product5.put(Constant.KEY_SIZE, "XL");
        product5.put(Constant.KEY_COLOR, "Black");
        product5.put(Constant.KEY_PRICE, 599);


        return addProductsToList(product1, product2, product3, product4, product5);
    }

    public static ArrayList<Product> getAllProducts(){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(getBoysProducts());
        products.addAll(getGirlsProducts());
        products.addAll(getWomenProducts());
        products.addAll(getMenProducts());
        return products;
    }

    private static ArrayList<Product> addProductsToList(Map<String, Object> product1,
                                                        Map<String, Object> product2,
                                                        Map<String, Object> product3,
                                                        Map<String, Object> product4,
                                                        Map<String, Object> product5) {

        ArrayList<Product> dummyProducts = new ArrayList<>();
        dummyProducts.add(new Product(product1));
        dummyProducts.add(new Product(product2));
        dummyProducts.add(new Product(product3));
        dummyProducts.add(new Product(product4));
        dummyProducts.add(new Product(product5));

        return dummyProducts;
    }
}
