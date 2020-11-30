package com.gildedrose.item;

import com.gildedrose.Item;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    public void updateAfterExpiration() {
        quality = 0;
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 11) {
                increaseQuality();
            }

            if (sellIn < 6) {
                increaseQuality();
            }
        }
    }

}
