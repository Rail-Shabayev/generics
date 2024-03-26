package org.rail;

public class Ninth {
    public static <T, U> void f(T t, U u, Character y) {
        System.out.println(t + " " + u + " " + y);
    }

    public static void main(String[] args) {
        f(23, "Sdf", 'c');
    }
}
