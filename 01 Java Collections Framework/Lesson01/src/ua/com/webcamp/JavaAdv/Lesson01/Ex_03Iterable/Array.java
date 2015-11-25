package ua.com.webcamp.JavaAdv.Lesson01.Ex_03Iterable;

import java.util.Iterator;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class Array<T> implements Iterable<T> {

    private T[] array;
    private int count;

    public Array(int size) {
        this.array = (T[]) new Object[size];
        count = 0;
    }

    public void add(T item) throws Exception {
        if (count >= array.length)
            throw new Exception("Array is full.");

        array[count++] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < count;
            }

            @Override
            public T next() {
                return array[current++];
            }
        };
    }
}
