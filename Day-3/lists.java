import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer number : list) {
            System.out.println(number);
        }

        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);

    }
}
