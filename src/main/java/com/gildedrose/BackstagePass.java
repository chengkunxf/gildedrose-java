package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            increaseQuality();

            if (sellIn < 11) {
                if (quality < 50) {
                    increaseQuality();
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    increaseQuality();
                }
            }
        }
    }
}
