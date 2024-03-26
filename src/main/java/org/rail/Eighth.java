package org.rail;

public class Eighth {
    public static <T, U, Y> void f(T t, U u, Y y) {
        System.out.println(t + " " + u + " " + y);
    }

    public static void main(String[] args) {
        f(23, "Sdf", 'c');
    }
}
