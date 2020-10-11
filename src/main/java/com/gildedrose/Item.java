package com.gildedrose;

import com.gildedrose.item.AgedBrie;
import com.gildedrose.item.BackstagePass;
import com.gildedrose.item.Sulfuras;

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

    void doSomething() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
        if (isAgedBrie()
                || isBackstagePass()) {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstagePass()) {
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

    protected void updateQualityAfterExpiration() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }
        if (isBackstagePass()) {
            quality = 0;
            return;
        }
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isBackstagePass() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }
}
