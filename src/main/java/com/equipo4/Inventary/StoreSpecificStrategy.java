package com.equipo4.Inventary;

import java.util.List;

public class StoreSpecificStrategy implements IInvetaryQueryStrategy{
    private String storeId;

    @Override
    public List<Product> query(List<Product> allProducts) {
        // logica de filtrado para producos en base al storeId
        return null;
    }
}
