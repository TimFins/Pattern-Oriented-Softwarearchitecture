package Iterator;

public class ArrayIterator implements Iterator {
    private int[] array;
    private int index = 0;

    public ArrayIterator(int[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public Object next() {
        return array[index++];
    }
}
