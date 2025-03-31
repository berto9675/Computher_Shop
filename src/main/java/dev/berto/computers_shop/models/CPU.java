package dev.berto.computers_shop.models;

public enum CPU {
    INTEL_I3("Intel Core i3"),
    INTEL_I5("Intel Core i5"),
    INTEL_I7("Intel Core i7"),
    AMD_RYZEN5("AMD Ryzen 5"),
    AMD_RYZEN7("AMD Ryzen 7"),
    APPLE_M1("Apple M1");

    private final String CPUName;
    
    CPU(String CPUName) {
        this.CPUName = CPUName;
    }
    
    public String getCPUName() {
        return CPUName;
    }
}
