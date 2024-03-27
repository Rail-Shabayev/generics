package org.rail;

import java.util.ArrayList;
import java.util.Collection;

public class Thirteenth {
    interface Generator<T> {
        T next();
    }
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
    public static  Iterable<? extends String> fill2(Collection<String> coll, Generator<? extends  String> gen, int n) {
        for (int i = 0; i < n; i++)
            coll.add(gen.toString());
        return coll;
    }

    public static void main(String[] args) {
        Collection<Integer> integers = fill(new ArrayList<>(), new Fibonacci(2), 12);
        for (Integer i : integers) {
            System.out.println(i);
        }
    }
}
