package com.gildedrose.item;

import com.gildedrose.Item;

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

    @Override
    protected void updateQualityAfterExpiration() {

    }
}
