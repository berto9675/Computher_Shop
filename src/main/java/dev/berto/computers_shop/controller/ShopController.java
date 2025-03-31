package dev.berto.computers_shop.controller;

import java.util.List;
import dev.berto.computers_shop.models.ComputerModel;
import dev.berto.computers_shop.models.ShopModelTest;
import dev.berto.computers_shop.models.Brand;

public class ShopController {

    private final ShopModelTest shop;

    public ShopController(ShopModelTest shop) {
        this.shop = shop;
    }

    public void addComputer(ComputerModel computer) {
        shop.addComputer(computer);
    }

    public void removeComputer(Brand brand, int id) {
        shop.deleteComputer(brand, id);
    }

    public List<ComputerModel> searchComputer(Brand brand) {
        return shop.searchComputer(brand);
    }

    public List<ComputerModel> showAllComputers() {
       return shop.computerList();
    }
}
