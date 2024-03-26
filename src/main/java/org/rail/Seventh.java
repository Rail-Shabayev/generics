package org.rail;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class Fibonacci implements Iterable<Integer> {
    private int count = 0;
    private int n = 0;

    public Fibonacci(int n) {
        this.n = n;
    }

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return Fibonacci.this.next();
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}

public class Seventh {
    public static void main(String[] args) {
        for(int i : new Fibonacci(18))
            System.out.print(i + " ");
    }
}
