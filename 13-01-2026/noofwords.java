import java.util.*;

public class noofwords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        int wordCount = 0;
        boolean inWord = false;
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        
        System.out.println("Number of words: " + wordCount);
        
        sc.close();
    }
}
