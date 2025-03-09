package String10Question;

import java.util.Arrays;

class useSort{
    public static void withOutSort(String str){
        char arr[] = str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                     temp = arr[i];
                    arr[i]=  arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }

    //Approch 2
    public static void sortUsing(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}

public class sortString extends useSort {
    public static void main(String[] args) {
        String str = "sohit";
        System.out.println("Without Sorting Array");
        withOutSort(str);
        sortUsing(str);
    }
}
