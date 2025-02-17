package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        Iterator arrayIterator = new ArrayIterator(array);

        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator listIterator = new ListIterator(list);

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
