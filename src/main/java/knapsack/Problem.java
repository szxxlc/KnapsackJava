package knapsack;

import java.util.ArrayList;
import java.util.Random;

public class Problem {
    public static int lowerBound = 1;
    public static int upperBound = 10;

    private int itemCount;
    private ArrayList<Item> items;

    public Problem(int itemCount, int seed) {
        this.itemCount = itemCount;
        this.items = new ArrayList<>();

        Random random = new Random(seed);
        for (int i = 0; i < itemCount; i++) {
            int weight = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int value = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            items.add(new Item(i + 1, weight, value));
        }
    }

    public Problem(ArrayList<Item> customItems) {
        this.itemCount = customItems.size();
        this.items = customItems;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> solve(int capacity) {
        ArrayList<Item> solution = new ArrayList<>();
        ArrayList<Item> sortedItems = new ArrayList<>(items);

        sortedItems.sort((a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        int remainingCapacity = capacity;

        for (Item item : sortedItems) {
            while (item.weight <= remainingCapacity) {
                solution.add(item);
                remainingCapacity -= item.weight;
            }
        }

        return solution;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Unbounded Knapsack Problem Instance:\n");
        for (Item item : items) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}
