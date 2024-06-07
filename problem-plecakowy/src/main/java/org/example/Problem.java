package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem {
    private int numberOfItems;
    private long seed;
    private int lowerBound;
    private int upperBound;
    private List<Item> items;

    public Problem(int numberOfItems, long seed, int lowerBound, int upperBound) {
        this.numberOfItems = numberOfItems;
        this.seed = seed;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.items = new ArrayList<>();
        generateItems();
    }

    private void generateItems() {
        Random random = new Random(seed);
        for (int i = 0; i < numberOfItems; i++) {
            int weight = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            int value = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            items.add(new Item("Item" + (i + 1), weight, value));
        }
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Problem with ").append(numberOfItems).append(" items:\n");
        for (Item item : items) {
            sb.append(item.getName()).append(" (weight: ").append(item.getWeight()).append(", value: ").append(item.getValue()).append(")\n");
        }
        return sb.toString();
    }
}
