import java.util.Scanner;

class Node {                      //1
    int data;                     //1
    Node next;                    //1
    
    Node(int data) {              //1
        this.data = data;         //1
        this.next = null;         //1
    }
}

class LinkedList {                       //1
    Node head;                           //1
    
    public void insert(int data) {        //1*n
        Node newNode = new Node(data);    //1*n
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {    //{n+1 (worst case)}*n
                temp = temp.next;          //n*n  
            }
            temp.next = newNode;           //1*n
        }
    }
    
    public void reverse() {                        
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {         //n
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public void display() {     
        Node temp = head;
        while (temp != null) {                     //n+1
            System.out.print(temp.data + " -> ");   //n
            temp = temp.next;                       //n
        }
        System.out.println("null");                 
    }
}

public class reverse_sll {                                //1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {                       //n+1
            list.insert(sc.nextInt());                      //n
        }
        
        System.out.println("Original List:");                //1
        list.display();
        
        list.reverse();
        
        System.out.println("Reversed List:");
        list.display();
        
        sc.close();
    }
}
//Time Complexity: O(n^2) 
//Space Complexity: O(1)
