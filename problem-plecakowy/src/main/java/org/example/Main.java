package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of item types: ");
        int numberOfItems = scanner.nextInt();

        System.out.print("Enter the random seed: ");
        long seed = scanner.nextInt();

        int lowerBound = 1;
        int upperBound = 10;

        Problem problem = new Problem(numberOfItems, seed, lowerBound, upperBound);
        System.out.print(problem);

        Knapsack knapsack = new Knapsack();
        for (Item item : problem.getItems()) {
            knapsack.addItem(item);
        }

        System.out.print("Enter the knapsack capacity: ");
        int capacity = scanner.nextInt();

        Result result = knapsack.solve(capacity);
        System.out.print(result.toString());
    }
}
