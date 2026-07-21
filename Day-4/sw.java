public class sw {
    public static void main(String[] args) {
        int choice = 1;
        switch (choice) {
            case 1:
                System.out.println("You entered 1");
                break;
            
            default:
                break;
        }
        String day = "Sunday";
        boolean isWeekend = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> false;
            case "Saturday", "Sunday" -> true;
            default -> throw new IllegalArgumentException("Not a Day of the Week"); 
        };
        System.out.println(isWeekend);
        String multiLine = "Hello my name is Virat\nAnd i am a sportman";
        String mLine = """
                Virat is a cricketer
                And "he" is currently playing 
                world cup. %
                """;
        if(mLine instanceof String str) {
            System.out.println(str.length());
        }
    

        //Records-> immutable, not setter methods and has only getter method. 


    }
}
