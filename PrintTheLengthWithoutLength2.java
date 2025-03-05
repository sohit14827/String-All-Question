import java.util.Scanner;
// 2️⃣ Write a program to find the length of a string without using length() method.
// Example:

// makefile
// Copy
// Edit
// Input:  Java  
// Output: 4 

public class PrintTheLengthWithoutLength2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String Here ! : ");
        String name = sc.nextLine();
       sc.close();
        int count=  0;
        for(int i=0;i<name.length();i++){
            count++; 
        }
        System.out.println("Length of String is : "+count);
    }
}
