import java.util.*;
public class reverse_a_no {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args []) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt();
        int reversed = 0;
        int temp = number;
        
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
