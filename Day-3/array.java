import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Sorted array elements:" + Arrays.toString(arr));
        

        //Date and time
        LocalDate today = LocalDate.now();
        
        LocalDate futureDate = today.plusDays(5);
        System.out.println("Today's date: " + today);
        System.out.println("Date after 5 days: " + futureDate);
        
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = currentTime.plusHours(2);
        System.out.println("Current time: " + currentTime);
        System.out.println("Time after 2 hours: " + futureTime);

        sc.close();
    }
}
