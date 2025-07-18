package com.equipo4.Logistic;

public abstract class DistributionStrategyFactory {
    public abstract IDistributionStrategy createStrategy(String type);
}
