package com.gildedrose;

public class BackstagePass extends Item {

    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        quality = quality - quality;
    }

    @Override
    protected void updateQuality() {
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
