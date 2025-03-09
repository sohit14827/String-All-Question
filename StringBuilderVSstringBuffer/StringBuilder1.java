package StringBuilderVSstringBuffer;

public class StringBuilder1 {
    public static void main(String[] args) {
        String str = "Hello";

        //Mutaable
        //method chainning
        // not thread safe
        StringBuilder sb = new StringBuilder("Sohit");
        StringBuilder reverse = sb.append("kumar").append("!").reverse();
        System.out.println(reverse);

    }
}
