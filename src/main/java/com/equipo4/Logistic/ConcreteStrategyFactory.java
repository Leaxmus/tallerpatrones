package com.equipo4.Logistic;

public class ConcreteStrategyFactory extends DistributionStrategyFactory {
    @Override
    public IDistributionStrategy createStrategy(String type) {
        if (type.equals("Rail")) return new RailStrategy();
        if (type.equals("Air")) return new AirStrategy();
        if (type.equals("Automotive")) return new AutomotiveStrategy();
        if (type.equals("Cyclist")) return new CyclistStrategy();
        return null;
    }
}
