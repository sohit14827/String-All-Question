package String10Question;

import java.util.HashMap;
import java.util.Map;

//frist APPROCH
class Occurrence{
    void  findNum(String str,int count){
      char ch = 'l';
      for(int i=0;i<str.length();i++){
        if(ch==str.charAt(i)){
            count ++;
        }
    }
    System.out.println("This word reapeted in String : "+ch+" = "+count);
    }
    // 2nd approch
    void findReapteedNumber(String str){
        Map<Character,Integer> mp = new HashMap<>();
        char[] chars = str.toCharArray(); 
        for(char ch : chars){
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                int value = mp.get(ch);
                mp.put(ch, value+1);
            }
        }
        System.out.println(mp);
    }
    

}

public class FindOccurrence {
    public static void main(String[] args) {
        String str = "hello";
        Occurrence o = new Occurrence();
        System.out.println("This is orignal String : "+str);
        o.findNum(str,0);
        System.out.println("This is orignal String : "+str);
        o.findReapteedNumber(str);
        
    }
}
