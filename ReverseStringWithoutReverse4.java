import java.util.Scanner;

public class ReverseStringWithoutReverse4 {
//     4️⃣ Write a program to reverse a string without using reverse() method.
// Example:

// makefile
// Copy
// Edit
// Input:  Java  
// Output:  avaJ  

public static void main(String[] args) {
    String str = "Sohit kumar from hasanpur";
     String temp = "";
    for(int i=str.length()-1; i>=0;i--){
       temp += str.charAt(i);

    }

    System.out.println("This is a orignal String "+str);
    System.out.println("This is a recerse String "+temp);
   

 Scanner scanner = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
        
        scanner.close();

        // Convert string to char array
        char[] charArray = str1.toCharArray();

        // Initialize two pointers
        int left = 0, right = charArray.length - 1;

        // Swap characters using two-pointer approach
        while (left < right) {
            // Swap characters at left and right indices
            char temp1 = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp1;

            // Move pointers inward
            left++;
            right--;
        }

        
        String reversedString = new String(charArray);

        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);

        String str2 = "Sohit kumar";
        String s = new String(str2);
       
        System.out.println( s.charAt(0));
        
    }

   
}
