package org.rail;

public class First {
    public static void main(String[] args) {
        Holders<Pets> petsHolders;
    }

    static class Holders<T> {
        T cantThink;
    }

    enum Pets {
        VALUE,
        KEY,
        HAMSTER,
        BIRD
    }
}
