package dev.berto.computers_shop.models;

public interface Computer {
    Brand getBrand();
    Memory getMemory();
    CPU getCPU();
    OS getOS();
    double getPrice();
    void setPrice(double price);
}
