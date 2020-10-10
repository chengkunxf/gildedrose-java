package com.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return true;
    }

    @Override
    protected void updateSellIn() {

    }
}
