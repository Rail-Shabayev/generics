package org.rail;

public class Third<A, B, C, D, E, F> {
    public final A a;
    public final B b;
    public final C c;
    public final D d;
    public final E e;
    public final F f;

    public static void main(String[] args) {
        short s = 2;
        byte as = 3;
        Third<Short, Byte, Double, Integer, Long, Boolean> sixTuple = new Third<>(s, as, 23.0, 23, 47L, true);
    }

    public Third(A a, B b, C c, D d, E e, F f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    public D getD() {
        return d;
    }

    public E getE() {
        return e;
    }

    public F getF() {
        return f;
    }
}
