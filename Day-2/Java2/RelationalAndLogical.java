    import java.util.Scanner;
public class RelationalAndLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.print("Enter two boolean values (true/false): ");
        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        sc.close();
    }
}
