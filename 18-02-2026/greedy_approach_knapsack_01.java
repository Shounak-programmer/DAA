import java.util.Arrays;
import java.util.Scanner;
public class greedy_approach_knapsack_01 {
    public static class Item {
        int weight;
        int value;
        double ratio;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) (value / weight);
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items and capacity of knapsack:");
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        System.out.println("Enter weight and value of each item:");
        Item arr[] = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.println("=======Item " + (i + 1) + "======");
            System.out.println("Weight: ");
            int weight = sc.nextInt();
            System.out.println("Value: ");
            int value = sc.nextInt();
            arr[i] = new Item(weight, value);
        }

        int maxValue = greedyKnapsack01(arr, capacity);
        System.out.println("(Greedy) Maximum value in 0-1 Knapsack = " + maxValue);
        
        sc.close();
    }
    

    public static int greedyKnapsack01(Item[] items, int capacity) {
        int n = items.length;
        int filled = 0;
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        int totalValue = 0;
        for (int i = 0; i < n; i++) {
            int idx = i;
            if (filled + items[idx].weight <= capacity) {
                totalValue += items[idx].value;
                filled += items[idx].weight;
                System.out.printf("Filled capacity: "+ filled + " / " + capacity + " | Total value: " + totalValue + "\n");
            }
        }
        return totalValue;
    }
    
}
