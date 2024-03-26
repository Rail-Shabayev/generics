package org.rail;

public class Fourth<T> {
    interface Selector {
        boolean end();

        Object current();

        void next();

    }
    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }
    private final T[] items;

    private int next = 0;

    public Fourth(int size) {
        items = (T[]) new Object[size];
    }

    public void add(T x) {
        if (next < items.length)
            items[next++] = x;
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Fourth<String> sequence = new Fourth<>(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
