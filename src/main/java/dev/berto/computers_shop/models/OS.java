package dev.berto.computers_shop.models;

public enum OS {
    WINDOWS_10("Windows 10"),
    WINDOWS_11("Windows 11"),
    MACOS("MacOS"),
    LINUX("Linux");

    private final String OSName;
    
    OS(String OSName) {
        this.OSName = OSName;
    }
    
    public String getOSName() {
        return OSName;
    }
}
