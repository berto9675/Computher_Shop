package dev.berto.computers_shop.models;

public enum Memory {
    RAM_8GB(8),
    RAM_16GB(16),
    RAM_32GB(32),
    RAM_64GB(64),
    RAM_128GB(128),
    RAM_256GB(256),
    RAM_512GB(512),
    RAM_1TB(1000);
    
    private final int capacity;
    
    Memory(int capacity) {
        this.capacity = capacity;
    }
    
    public int getCapacity() {
        return capacity;
    }
}
