package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Knapsack {
    private List<Item> items;

    public Knapsack() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Result solve(int capacity) {
        Collections.sort(items, Comparator.comparingDouble(Item::valueToWeightRatio).reversed());

        List<Item> resultItems = new ArrayList<>();
        int totalWeight = 0;
        int totalValue = 0;

        for (Item item : items) {
            while (totalWeight + item.getWeight() <= capacity) {
                resultItems.add(item);
                totalWeight += item.getWeight();
                totalValue += item.getValue();
            }
        }

        return new Result(resultItems, totalWeight, totalValue);
    }
}
