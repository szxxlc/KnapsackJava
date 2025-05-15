package knapsack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {

    @Test
    public void NumberCountTest(){
        Problem.lowerBound = 1;
        Problem.upperBound = 10;
        Problem pr1 = new Problem(5,123);
        assertEquals(5,pr1.getItems().size(), "Instance should contain exactly set number of items.");
    }

    @Test
    public void ItemsInBoundsTest() {
        Problem.lowerBound = 1;
        Problem.upperBound = 10;
        Problem pr2 = new Problem(5, 123);

        for (Item item : pr2.getItems()) {
            assertTrue(item.weight >= 1 && item.weight <= 10, "Item weight out of bounds: " + item.weight);
            assertTrue(item.value >= 1 && item.value <= 10, "Item value out of bounds: " + item.value);
        }
    }

    @Test
    public void IsEmptyWhenNoItemFitsTest() {
        Problem.lowerBound = 11;
        Problem.upperBound = 20;
        Problem pr3 = new Problem(5, 123);
        ArrayList<Item> result = pr3.solve(10);
        assertTrue(result.isEmpty(), "Solution should be empty when no item fits.");
    }

    @Test
    public void IsNotEmptyWhenItemFitsTest(){
        Problem.lowerBound = 1;
        Problem.upperBound = 10;
        Problem pr4 = new Problem(5, 123);
        ArrayList<Item> result = pr4.solve(100);
        assertFalse(result.isEmpty(), "Solution should not be empty when at least one item fits.");
    }

    @Test
    public void ManualInstanceSolutionSumTest() {
        ArrayList<Item> customItems = new ArrayList<>();
        customItems.add(new Item(1, 3, 5));   // id, weight, value
        customItems.add(new Item(2, 5, 8));
        customItems.add(new Item(3, 7, 9));

        Problem pr6 = new Problem(customItems);
        ArrayList<Item> result = pr6.solve(15);

        int totalWeight = 0;
        int totalValue = 0;
        for (Item item : result) {
            totalWeight += item.weight;
            totalValue += item.value;
        }

        assertTrue(totalWeight <= 15, "Total weight exceeds capacity (" + totalWeight + " > 15)");
        assertEquals(25, totalValue, "Expected total value is 25, but was " + totalValue);
    }
}