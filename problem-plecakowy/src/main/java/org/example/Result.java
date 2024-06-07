package org.example;

import java.util.List;

public class Result {
    private List<Item> items;
    private int totalWeight;
    private int totalValue;

    public Result(List<Item> items, int totalWeight, int totalValue) {
        this.items = items;
        this.totalWeight = totalWeight;
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total weight: ").append(totalWeight).append("\n");
        sb.append("Total value: ").append(totalValue).append("\n");
        sb.append("Items in the knapsack:\n");
        for (Item item : items) {
            sb.append(item.getName()).append(" (weight: ").append(item.getWeight()).append(", value: ").append(item.getValue()).append(")\n");
        }
        return sb.toString();
    }
}
