import java.util.Scanner;

public class PrintStringByUser1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name Here.. ! ");
        String name =  sc.nextLine();
        sc.close();
        System.out.println("Name : "+name);
        }
}