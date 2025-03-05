import java.util.Scanner;

public class CountTheVoweles3 {
// 3️⃣ Write a program to count the number of vowels and consonants in a given string.
// Example:

// yaml
// Copy
// Edit
// Input:  Hello  
// Output: Vowels: 2, Consonants: 3  
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A String Here.. ! ");
    String str  = sc.nextLine();
    sc.close();
    str.toLowerCase();
   int v = 0, C = 0;
    int total = 0;
   for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(Character.isLetter(ch)){
            
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                v++;
                
            }else{
                C++;
            }
            total++;
        }
    }
    System.out.println("Vowelese is : "+v);
    System.out.println("Constant is : "+C);
    System.out.println("Total String Count is : "+total);


}
}
