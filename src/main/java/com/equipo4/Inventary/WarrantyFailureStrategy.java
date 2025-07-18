package com.equipo4.Inventary;

import java.util.List;

public class WarrantyFailureStrategy implements IInvetaryQueryStrategy {
    @Override
    public List<Product> query(List<Product> allProducts) {
        // Logica de filtrado para productos con fallas durante la garantia
        return null;
    }
}
