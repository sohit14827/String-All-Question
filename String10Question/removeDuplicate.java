package String10Question;

import java.util.LinkedHashSet;
import java.util.Set;

class Doplicate{
    //Apploch 1 
void sttringBuilder(String str){
   
    StringBuilder sb = new StringBuilder();
    str.chars().distinct().forEach(c -> sb.append((char)c));
    System.out.println("after remove doplicate string : "+sb);
    System.out.println("2nd ++++++++++++++++++++++++++++++++++");
}
//Approch 2
 void stringBuilder(String str){
    
    StringBuilder str1=  new StringBuilder();
    for(int i=0; i<str.length();i++){
        char charAt = str.charAt(i);
        int indexOf = str.indexOf(charAt,i+1);
        if(indexOf==-1){
            str1.append(charAt);
        }
    }
    System.out.println("After remove duplicate string : "+str1);
    System.out.println("3rd ++++++++++++++++++++++");
 }

 //Approch 3
void charArray(String str){
    char[] arr = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<arr.length;i++){
        boolean repated = false;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i] == arr[j]){
                repated=  true;
                break;
            }
        }
        if(!repated){
            sb.append(arr[i]);
        }
    }
    System.out.println("After remove duplicate string : "+sb);
    System.out.println("4ht ++++++++++++++++++++++");
}

// 4th Approch 
void setInterface(String str){
    StringBuilder sb = new StringBuilder();
    Set<Character> st = new LinkedHashSet<>();
    for(int i= 0; i<str.length();i++){
        st.add(str.charAt(i));
        
    }
    for(Character c:st){
        sb.append(c);
    }
    System.out.println("After remove duplicate String : "+sb);
    
}

}

public class removeDuplicate {
    public static void main(String[] args) {
       Doplicate d= new Doplicate();
       String str = "programing";
       System.out.println("Orignal String is >> "+str);
       d.sttringBuilder(str);
       System.out.println("Orignal String is >> "+str);
       d.stringBuilder(str);
       System.out.println("Orignal String is >> "+str);
       d.setInterface(str);
       System.out.println("Orignal String is >> "+str);
       d.charArray(str);
    }
}
