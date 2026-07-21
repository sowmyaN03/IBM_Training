@FunctionalInterface
interface in {
    void fly();
    // void got();
}
// First way of implementing functional interface using class
class inex implements in {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

}

public class lambda {
    public static void main(String[] args) {
        in obj = new inex();
        
        //second way of implementing functional interface using anonymous class
        in obj1 = new in() {

            @Override
            public void fly() {
                System.out.println("Flying from anonymous");
            }    
        };
        
        //third way of implementing functional interface using lambda expression
        in obj3 = () -> System.out.println("Flying from lambda"); 
        obj.fly();
        obj1.fly();
        obj3.fly();
    }
}