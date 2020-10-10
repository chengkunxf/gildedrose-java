package com.gildedrose.item;

import com.gildedrose.Item;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }
}
