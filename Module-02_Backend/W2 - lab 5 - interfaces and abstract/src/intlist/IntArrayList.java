package intlist;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] data = new int[10];
    private int size = 0;

    public void add(int number) {
        if (size == data.length) {
            int newSize = data.length + data.length / 2;
            data = Arrays.copyOf(data, newSize);
        }
        data[size++] = number;
    }

    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return data[id];
    }
}