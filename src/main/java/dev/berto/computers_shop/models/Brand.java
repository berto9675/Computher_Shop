package dev.berto.computers_shop.models;

public enum Brand {
    DELL("Dell"),
    HP("HP"), 
    LENOVO("Lenovo"), 
    ASUS("Asus"), 
    ACER("Acer"), 
    APPLE("Apple"),
    MICROSOFT("Microsoft"),
    SAMSUNG("Samsung"), 
    GOOGLE("Google"), 
    MSI("MSI"), 
    LG("LG"), 
    TOSHIBA("Toshiba"),
    HUAWEI("Huawei"),
    RAZER("Razer");
     
    private final String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}