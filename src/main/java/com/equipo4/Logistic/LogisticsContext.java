package com.equipo4.Logistic;

import java.util.List;

import com.equipo4.Item;

public class LogisticsContext {
    private IDistributionStrategy strategy;

    public void setStrategy(IDistributionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeDistribution(List<Item> items) {
        strategy.distribute(items);
    }
}