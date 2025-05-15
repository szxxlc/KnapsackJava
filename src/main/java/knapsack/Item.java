package knapsack;

public class Item {
    public int id;
    public int weight;
    public int value;

    public Item(int id, int weight, int value) {
        this.id = id;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Weight: " + weight + ", Value: " + value;
    }
}
