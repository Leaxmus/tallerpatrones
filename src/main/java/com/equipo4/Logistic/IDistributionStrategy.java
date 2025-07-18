package com.equipo4.Logistic;

import java.util.List;

import com.equipo4.Item;

public interface IDistributionStrategy {
    public void distribute(List<Item> list);
}
