package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {
        data.addFirst(val);
        return true;
    }

    @Override
    public T pop() {
        T val = data.getFirst();
        data.poll();
        return val;
    }

    @Override
    public T peek() {
        T val = data.getFirst();
        return val;
    }

    @Override
    public int size() {
        return data.size();
    }
}
