package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    @Override
    protected boolean isBackStagePass() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        quality = 0;
    }
}
