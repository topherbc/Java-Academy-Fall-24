package com.pluralsight;

public class CollectableCards extends Card implements SellableInterface {

    private String rarity, owner;
    private double resellValue;
    private int age;
    private boolean signed, foil;

    public CollectableCards(String description, String type, String rarity, String owner, double resellValue, int age, boolean signed, boolean foil) {
        super(description, type);
        this.rarity = rarity;
        this.owner = owner;
        this.resellValue = resellValue;
        this.age = age;
        this.signed = signed;
        this.foil = foil;
    }

    public CollectableCards(String description, String type) {
        super(description, type);
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void sell() {
        System.out.println("Sold card! ");
    }

    public double getResellValue() {
        return resellValue;
    }

    @Override
    public String getRarityValue() {
        return this.rarity;
    }

    public void setResellValue(double resellValue) {
        this.resellValue = resellValue;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public boolean isFoil() {
        return foil;
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
