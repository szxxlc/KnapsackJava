package knapsack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Problem.lowerBound = 1;
        Problem.upperBound = 10;

        Problem problem = new Problem(5, 1234567890);
        System.out.println(problem);

        int capacity = 20;
        ArrayList<Item> solution = problem.solve(capacity);

        System.out.println("Solution:");
        for (Item item : solution) {
            System.out.println(item);
        }
    }
}
