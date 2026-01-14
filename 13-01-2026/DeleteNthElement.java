import java.util.*;

public class DeleteNthElement {
    
    static int[] arr;
    static int size;
    
    public static void deleteNthElement(int n) {
        if (n < 1 || n > size) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        // Shift elements to the left to overwrite the nth element
        for (int i = n - 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        size--;  // Reduce the size after deletion
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        
        arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter the position of element to delete (1 to " + size + "): ");
        int n = sc.nextInt();
        
        deleteNthElement(n);
        
        System.out.print("After deleting " + n + "th element: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
