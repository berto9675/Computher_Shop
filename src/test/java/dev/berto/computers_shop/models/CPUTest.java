package dev.berto.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CPUTest {
    @Test
    @DisplayName("Test del enum del procesador del ordenador")
    void testGetCPU() {
        assertEquals("Intel Core i3", CPU.INTEL_I3.getCPUName());
        assertEquals("Intel Core i5", CPU.INTEL_I5.getCPUName());
        assertEquals("Intel Core i7", CPU.INTEL_I7.getCPUName());
        assertEquals("AMD Ryzen 5", CPU.AMD_RYZEN5.getCPUName());
        assertEquals("AMD Ryzen 7", CPU.AMD_RYZEN7.getCPUName());
        assertEquals("Apple M1", CPU.APPLE_M1.getCPUName());
    }
}
