package dev.berto.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerModelTest {
private ComputerModel computer;

    @BeforeEach
    void setUp() {
        computer = new ComputerModel(Brand.ASUS, Memory.RAM_16GB, CPU.INTEL_I7, OS.WINDOWS_10, 1500.0);
    }
    
    @Test
    @DisplayName("Test del constructor del modelo de ordenador")
    void testComputerModel() {
        assertEquals(Brand.ASUS, computer.getBrand());
        assertEquals(Memory.RAM_16GB, computer.getMemory());
        assertEquals(CPU.INTEL_I7, computer.getCPU());
        assertEquals(OS.WINDOWS_10, computer.getOS());
        assertEquals(1500.0, computer.getPrice());
    }

    @Test
    @DisplayName("Test del método setPrice")
    void testSetPrice() {
        computer.setPrice(1600.0);
        assertEquals(1600.0, computer.getPrice());
    }

    @Test
    @DisplayName("Test del método toString")
    void testToString() {
        assertEquals("Ordenador: marca: Asus, memoria RAM: 16GB, CPU: Intel Core i7, OS: Windows 10, precio: 1500.0€", computer.toString());
    }
}
