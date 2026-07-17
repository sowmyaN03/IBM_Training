
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter your favorite color: ");
        String favoriteColor = scanner.next();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Your gender is: " + gender);
        System.out.println("Your favorite color is: " + favoriteColor);

        scanner.close();
    }
}
