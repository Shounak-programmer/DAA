import java.util.*;

public class insertnthposition {
    
    static int[] arr;
    static int size;
    
    public static void insertAtNthPosition(int n, int element) {
        if (n < 1 || n > size + 1) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        // Shift elements to the right to make space for new element
        for (int i = size; i >= n; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[n - 1] = element;  // Insert the element at nth position
        size++;  // Increase the size after insertion
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial size of the array: ");
        size = sc.nextInt();
        
        arr = new int[size + 10];  // Extra space for insertions
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter the position to insert (1 to " + (size + 1) + "): ");
        int n = sc.nextInt();
        
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        
        insertAtNthPosition(n, element);
        
        System.out.print("After inserting " + element + " at position " + n + ": ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
//Time Complexity: O(n), Space Complexity: O(n)
