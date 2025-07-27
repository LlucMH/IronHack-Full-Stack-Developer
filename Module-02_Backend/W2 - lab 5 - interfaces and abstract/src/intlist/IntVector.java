package intlist;

import java.util.Arrays;

public class IntVector implements IntList {
    private int[] data = new int[20];
    private int size = 0;

    public void add(int number) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = number;
    }

    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return data[id];
    }
}