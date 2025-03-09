package String10Question;

import java.util.Arrays;

class charPresent{
    //frist approch
    public static void cheackPresentString(String str,char ch){
        //chack char present in String
        if(str.indexOf(ch)==-1){
            System.out.println("Given Character not Avalavle in the String.. ");
            System.exit(0);
        } 
        // Logic to replace char occurance
        char[] charArray = str.toCharArray();
        int count = 1;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i] == ch){
                charArray[i]= String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(charArray));
    }
    // 2nd opproch 
    public static void cheackPresentString1(String str, char ch){
        if(str.indexOf(ch)==-1){
            System.out.println("Given Character not Avalavle in the String.. ");
            System.exit(0);
        }
        int count = 1;
        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            if(ch1 == ch){
               str = str.replaceFirst(String.valueOf(ch), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }
  
}


public class replaceCharTwithOccurrence extends charPresent{
    public static void main(String[] args) {
        String str = "opentest";
        char ch = 't';
        System.out.println("Frist Logic here...");
        // charPresent.cheackPresentString(str, ch);
        cheackPresentString(str, ch);
        System.out.println("Secound Logic here...");
        cheackPresentString1(str, ch);
    }
}
