package com.pluralsight.finance.assets;

import com.pluralsight.finance.FixedAsset;

public class House extends FixedAsset {
    private int yearBuilt, squareFeet, bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }


    @Override
    public double getValue() {
        return this.marketValue;
    }
}
