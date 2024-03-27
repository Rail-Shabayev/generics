package org.rail;

import java.util.Stack;

public class Eleventh {
    public static <T> Stack<T> stack() {
        return new Stack<>();
    }

    public static void main(String[] args) {
        Stack<Stack<String>> stack = Eleventh.stack();
        stack.add(Eleventh.stack());
        System.out.println(stack);
    }
}
