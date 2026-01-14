import java.util.*;      
public class reverse_a_no {                               //1
    public static void main(String args []) {             //1
        System.out.println("Enter a Number");             //1
        Scanner sc = new Scanner(System.in);              //1
        int number = sc.nextInt();                        //1
        int reversed = 0;                                 //1
        int temp = number;                                //1
        
        while (temp != 0) {                               //log10(n) + 1 
            reversed = reversed * 10 + temp % 10;         //log10(n)
            temp /= 10;                                   //log10(n)
        }                                                 //log10(n)
        
        System.out.println("Original number: " + number);    //1
        System.out.println("Reversed number: " + reversed);  //1
        sc.close();                                        //1
    }
}
//Time Complexity = O(log10(n)), Space Complexity = O(1)
