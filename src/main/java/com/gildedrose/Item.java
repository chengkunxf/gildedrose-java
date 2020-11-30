package com.gildedrose;

import com.gildedrose.item.AgedBrie;
import com.gildedrose.item.BackstagePass;
import com.gildedrose.item.Sulfuras;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
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

    void dosomething() {
        updateQuality();

        updateSellIn();

        if (isExpired()) {
            updateAfterExpiration();
        }
    }

    public void updateAfterExpiration() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    public void updateSellIn() {
        sellIn = sellIn - 1;
    }

    public void updateQuality() {
        if(isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }

        if (quality > 0) {
            quality = quality - 1;
        }

    }

    private boolean isAgedBrie() {
        return name.equals(AGED_BRIE);
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
