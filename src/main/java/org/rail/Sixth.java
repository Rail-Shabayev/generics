package org.rail;

import java.util.ArrayList;
import java.util.Random;

public class Sixth<T> {
    private final ArrayList<T> storage = new ArrayList<>();
    private final Random rand = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        Sixth<String> rs = new Sixth<>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++) {
            System.out.print(rs.select() + " ");
        }

        Sixth<Integer> integerSixth = new Sixth<>();
        for (int i = 0; i < 10; i++) {
            integerSixth.add(i);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(integerSixth.select());
        }
        System.out.println("--------------");
        Sixth<Character> characterSixth = new Sixth<>();
        for (int i = 0; i < 10; i++) {
            characterSixth.add((char) i);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(integerSixth.select());
        }


    }
}
