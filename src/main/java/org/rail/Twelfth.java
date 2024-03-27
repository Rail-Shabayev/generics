package org.rail;

import java.util.Stack;

public class Twelfth {
    public static <T> Stack<T> stack() {
        return new Stack<>();
    }

    public static void main(String[] args) {
        Stack<Stack<String>> stack = Eleventh.<Stack<String>>stack();
        stack.add(Eleventh.<String>stack());
        System.out.println(stack);
    }
}
