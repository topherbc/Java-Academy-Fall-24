package com.pluralsight.finance.assets;

import com.pluralsight.finance.FixedAsset;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return this.weight;
    }
}
