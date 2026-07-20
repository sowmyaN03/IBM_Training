import java.util.*;
import java.time.*;
 
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
 
public class WorkdayBill {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of purchase: ");
        LocalDate date = LocalDate.parse(sc.next());
        LocalDate billDate = date.plusDays(30);
        Day day = Day.valueOf(billDate.getDayOfWeek().toString());
        System.out.println(billDate.getDayOfWeek());
        switch (day) {
            case SATURDAY:
                System.out.println("The Purchase date : " + date);
                billDate = billDate.plusDays(2);
                System.out.println("The Bill date : " + billDate);
                day = Day.valueOf(billDate.getDayOfWeek().toString());
                System.out.println(day);
                break;
            case SUNDAY:
                System.out.println("The Purchase date : " + date);
                billDate = billDate.plusDays(1);
                System.out.println("The Bill date : " + billDate);
                day = Day.valueOf(billDate.getDayOfWeek().toString());
                System.out.println(day);
                break;
            default:
                System.out.println("The Purchase date : " + date);
                System.out.println("The Bill date : " + billDate);
                System.out.println(day);
                break;
        }
        sc.close();
    }
}
// input date format is YYYY-MM-DD.