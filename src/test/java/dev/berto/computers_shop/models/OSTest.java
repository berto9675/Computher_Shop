package dev.berto.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OSTest {
  @Test
    @DisplayName("Test del enum del sistema operativo del ordenador")
    void testGetOS() {
        assertEquals("Windows 10", OS.WINDOWS_10.getOSName());
        assertEquals("Windows 11", OS.WINDOWS_11.getOSName());
        assertEquals("MacOS", OS.MACOS.getOSName());
        assertEquals("Linux", OS.LINUX.getOSName());
    }
}
