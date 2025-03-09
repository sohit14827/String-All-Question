package String10Question;

class Reverse{
    void splict(String str){
        String[] words = str.split(" ");
        String output = " ";
        for(String word : words){
            //reverse words
            String revWord = "";
            for(int i= word.length()-1;i>=0;i--){
                revWord = revWord + word.charAt(i);
            }
            output = output + revWord+" ";
        }
        System.out.println("Reverse String : "+output);
    }
}

public class reverseMultipleString {
    public static void main(String[] args) {
        
        String str = "Sohit kumar vill bheemathakri";
        System.out.println("Orignal String is : "+str);
        Reverse r = new Reverse();
        r.splict(str);
    }
}
