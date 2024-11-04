package com.pluralsight.finance;

import com.pluralsight.finance.interfaces.Valuable;

public abstract class FixedAsset implements Valuable {
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();
}
