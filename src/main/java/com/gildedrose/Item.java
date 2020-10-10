package com.gildedrose;

public class Item {

    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public String name;

    public int sellIn;

    public int quality;

    public static Item createAgedBrie(int sellIn, int quality) {
        return new Item(AGED_BRIE, sellIn, quality);
    }

    public static Item createBackstagePass(int sellIn, int quality) {
        return new Item(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    public static Item createSulfuras(int sellIn, int quality) {
        return new Item(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    public static Item createNormal(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    private Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void something() {
        if (!isAgedBrie()
                && !isBackstagePass()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
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
        }

        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!isAgedBrie()) {
                if (!isBackstagePass()) {
                    if (quality > 0) {
                        if (!isSulfuras()) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

    private boolean isSulfuras() {
        return name.equals(SULFURAS_HAND_OF_RAGNAROS);
    }

    private boolean isBackstagePass() {
        return name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT);
    }

    private boolean isAgedBrie() {
        return name.equals(AGED_BRIE);
    }
}
