package com.gildedrose;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItemQuality() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    protected void updateQualityAfterExpiration() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
        } else {
            if (isBackStagePass()) {
                quality = 0;
            } else {
                if (quality > 0) {
                    if (isSulfuras()) {
                        return;
                    }
                    quality = quality - 1;
                }
            }
        }
    }

    protected void updateQuality() {
        if (isAgedBrie()
                || isBackStagePass()) {
                    if (quality < 50) {
                        quality = quality + 1;

                        if (isBackStagePass()) {
                            if (sellIn < 11) {
                                if (quality < 50) {
                                    quality = quality + 1;
                                }
                            }

                            if (sellIn < 6) {
                                if (quality < 50) {
                                    quality = quality + 1;
                                }
                            }
                        }
                    }
                } else {
            if (quality > 0) {
                if (isSulfuras()) {
                    return;
                }
                quality = quality - 1;
            }
        }
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackStagePass() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }
}
