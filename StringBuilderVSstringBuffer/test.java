package StringBuilderVSstringBuffer;

public class test {
    public static void main(String[] args) {
        String str = "Sohit";
        str.concat(" Kumar");
        System.out.println(str);

        String concat = str.concat(" Kumar");
        System.out.println(concat);

        
    }
}
