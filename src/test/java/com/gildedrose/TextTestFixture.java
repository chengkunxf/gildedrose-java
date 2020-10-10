package com.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.gildedrose.Item.*;

public class TextTestFixture {
    public static void main(String[] args) {
        System.out.println(TextTestFixture.getOutput());
    }

    public static String getOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[]{
                createNormal("+5 Dexterity Vest", 10, 20), //
                createAgedBrie(2, 0), //
                createNormal("Elixir of the Mongoose", 5, 7), //
                createSulfuras(0, 80), //
                createSulfuras(-1, 80),
                createBackstagePass(15, 20),
                createBackstagePass(10, 49),
                createBackstagePass(5, 49),
                createBackstagePass(1, 20),
                // this conjured item does not work properly yet
                createNormal("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 3; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.updateQuality();
        }

        return out.toString();
    }
}
