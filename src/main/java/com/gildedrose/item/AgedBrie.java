package com.gildedrose.item;

import com.gildedrose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }


    @Override
    public void updateAfterExpiration() {
        increaseQuality();
    }
}
