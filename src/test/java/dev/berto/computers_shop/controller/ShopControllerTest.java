package dev.berto.computers_shop.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.berto.computers_shop.models.Brand;
import dev.berto.computers_shop.models.CPU;
import dev.berto.computers_shop.models.ComputerModel;
import dev.berto.computers_shop.models.Memory;
import dev.berto.computers_shop.models.ShopModel;

public class ShopControllerTest {
private ShopController controller;
    private ShopModel shop;

    @BeforeEach
    void setUp() {
        shop = new ShopModel("Computer Shop", "Pepito", "123456789");
        controller = new ShopController(shop);
        controller.addComputer(new ComputerModel(Brand.APPLE, Memory.RAM_8GB, CPU.APPLE_M1, OS.MACOS, 1000));
    }

    @Test
    @DisplayName("Test para añadir un ordenador desde el controlador")
    public void testAddComputer() {
        controller.addComputer(new ComputerModel(Brand.ASUS, Memory.RAM_16GB, CPU.AMD_RYZEN5, OS.WINDOWS_10, 1500));
        assertEquals(shop.computerList().size(), 2);
    }

    @Test
    @DisplayName("Test para eliminar un ordenador desde el controlador")
    public void testRemoveComputer() {
        controller.removeComputer(Brand.APPLE, 2);
        assertEquals(0, shop.computerList().size());
    }

    @Test
    @DisplayName("Test para buscar un ordenador por marca desde el controlador")
    public void testSearchComputer() {
        controller.searchComputer(Brand.APPLE);
        assertEquals(shop.searchComputer(Brand.APPLE).get(0).getBrand(), Brand.APPLE);
    }

    @Test
    @DisplayName("Test para mostrar todos los ordenadores desde el controlador")
    public void testShowAllComputers() {
        controller.showAllComputers();
        assertEquals(shop.computerList().size(), 1);
    }
}
