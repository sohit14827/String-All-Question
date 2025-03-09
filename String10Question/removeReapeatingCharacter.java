package String10Question;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 input abbac
 output bac
 input abcabcbb
 output abc
 input java
 output jav
 */

class reapted{
public static void LengthOfLongestSubstring(String str){
    String LongestSubstring = null;
    int LongestSubstringLength = 0;

    Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
    char[] arr = str.toCharArray();
    for(int i=0;i<arr.length;i++){
       char ch =  arr[i];
       if(!map.containsKey(ch)){
        map.put(ch, i);
       }else{
        i = map.get(ch);
        map.clear();
       }
       if(map.size()> LongestSubstringLength){
        LongestSubstringLength = map.size();
        LongestSubstring = map.keySet().toString();
       }
    }
    System.out.println("The Longest substring : "+LongestSubstring);
    System.out.println("The Longest substing Length : "+LongestSubstringLength);
}
}

public class removeReapeatingCharacter extends reapted {
    public static void main(String[] args) {
          LengthOfLongestSubstring("java");
    }
}
