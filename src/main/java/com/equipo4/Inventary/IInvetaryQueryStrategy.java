package com.equipo4.Inventary;

import java.util.List;

public interface IInvetaryQueryStrategy {
    public List<Product> query(List<Product> allProducts);
}
