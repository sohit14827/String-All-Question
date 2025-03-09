package String10Question;

 class reverse{
    // Approch 1
 void useCharArray(String str){
     System.out.print("String is reverse Byusing useCharArray  : ");
     char[] chArr = str.toCharArray();
     for(int i=str.length()-1;i>=0;i--){
        System.out.print(chArr[i]);
    }
    System.out.println();
    }
    //Approch 2
    void useCharAt(String str1){
        System.out.print("String is reverse Byusing UseCharAt : ");
        for(int i=str1.length()-1;i>=0;i--){
            char charAt = str1.charAt(i);
            System.out.print(charAt);
        }
        System.out.println();
    }
    // Approch 3
    void StringBufferE(String str){
        StringBuffer str1 = new StringBuffer(str);
        StringBuffer reverse = str1.reverse();
        System.out.print("String reverse useng StringBuffer : "+reverse);
        System.out.println();
    }
    //Approch 4
    void stringBuilder(String str){
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder reverse = str1.reverse();
        System.out.println("String reverse using StringBuilder : "+reverse);
    }
    
}

 class reverseString {
    public static void main(String[] args) {
        String str = "sohit";
        reverse s = new reverse();
        s.useCharArray(str);
        String str1= "vikas";
        s.useCharAt(str1);
        s.StringBufferE(str1);
        s.stringBuilder(str);
       
    }
}
