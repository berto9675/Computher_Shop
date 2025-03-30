package dev.berto.computers_shop.models;

import java.util.List;


public interface Shop {
    String getShopName();
    String getOwner();
    String getId();

    List<ComputerModel> computerList();
    void addComputer(ComputerModel computer);
    boolean deleteComputer(Brand brand, int id);
    List<ComputerModel> searchComputer(Brand brand);
}