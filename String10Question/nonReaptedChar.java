package String10Question;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Reapted{
    // 1st Approch
    void usingCollection(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        System.out.print(map);
        System.out.println();
      for(Entry<Character,Integer> entrset : map.entrySet()){
        if(entrset.getValue()==1){
            System.out.println(entrset.getKey());
        }
      }

    }
    // 2nd Approch
    void withOutCollection(String str){
        for(int i=0;i<str.length();i++){
            boolean uniqu = true;
            for( int  j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    uniqu = false;
                    break;
                }
            }
            if(uniqu){
                System.out.print(str.charAt(i));
                
            }
        }
        System.out.println();
    }
}

public class nonReaptedChar {
    public static void main(String[] args) {
        String str = "aabbd";
        Reapted r= new Reapted();
        r.withOutCollection(str);
        r.usingCollection(str);
    }
}
