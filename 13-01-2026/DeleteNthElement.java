import java.util.*;

public class DeleteNthElement {                                        //Time: 1
    
    static int[] arr;                                                  //Time: 1 //Space: n
    static int size;                                                   //Time: 1  //Space: 1
    
    public static void deleteNthElement(int n) {                       //Time: 1
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
        
        arr = new int[size];                                 //Time: 1 //Space: n
        System.out.println("Enter " + size + " elements:");  //Time: 1 
        for (int i = 0; i < size; i++) {                      //Time: n+1
            arr[i] = sc.nextInt();                            //Time: n
        }
        
        System.out.print("Original array: ");               //Time: 1 
        for (int i = 0; i < size; i++) {                    //Time: n+1
            System.out.print(arr[i] + " ");                 //Time: n
        }
        System.out.println();
        
        System.out.print("Enter the position of element to delete (1 to " + size + "): ");
        int n = sc.nextInt();
        
        deleteNthElement(n);
        
        System.out.print("After deleting " + n + "th element: ");
        for (int i = 0; i < size; i++) {                 //Time: n+1
            System.out.print(arr[i] + " ");              //Time: n
        }
        System.out.println();
        
        sc.close();
    }
}
//Time Complexity: O(n), Space Complexity: O(n)
