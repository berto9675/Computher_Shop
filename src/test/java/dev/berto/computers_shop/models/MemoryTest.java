package dev.berto.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemoryTest {
@Test
    @DisplayName("Test del enum de la memoria del ordenador")
    void testMemory() {
        assertEquals(8, Memory.RAM_8GB.getCapacity());
        assertEquals(16, Memory.RAM_16GB.getCapacity());
        assertEquals(32, Memory.RAM_32GB.getCapacity());
        assertEquals(64, Memory.RAM_64GB.getCapacity());
        assertEquals(128, Memory.RAM_128GB.getCapacity());
        assertEquals(256, Memory.RAM_256GB.getCapacity());
        assertEquals(512, Memory.RAM_512GB.getCapacity());
        assertEquals(1000, Memory.RAM_1TB.getCapacity());
    }
}
