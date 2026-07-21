import java.util.Stack;

public class stackex {
    stackex() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.get(0));
        stack.clear();
        System.out.println(stack);
    }

    public static void main(String[] args) {
        stackex s = new stackex();
    }
}
