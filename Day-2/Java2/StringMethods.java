import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(0,3));
        System.out.println(name.charAt(name.length()-1)); 
        System.out.println(name.substring(0, 3));

        sc.close();
    }
}
