package com.equipo4.Inventary;

import java.util.List;

public class InvetoryViewer {
    private IInvetaryQueryStrategy strategy;

    public void setStrategy(IInvetaryQueryStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Product> getProducts(List<Product> allProducts) {
        return strategy.query(allProducts);
    }
}
