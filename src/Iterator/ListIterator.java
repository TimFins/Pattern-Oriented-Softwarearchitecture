package Iterator;

import java.util.List;

public class ListIterator implements Iterator {
    private List list;
    private int index;

    public ListIterator(List list) {
        this.list = list;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public Object next() {
        return list.get(index++);
    }
}
