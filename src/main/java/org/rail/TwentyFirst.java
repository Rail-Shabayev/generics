package org.rail;

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

public class TwentyFirst<T> {
    Class<T> kind;
    Map<String, Class<?>> typeMap = new HashMap<>();

    public TwentyFirst(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Class<?> kind) {
        typeMap.put(typename, kind);
    }

    public Class<?> createNew(String typename) {
        if (typeMap.containsKey(typename)) {
            return typeMap.get(typename);
        }
        throw new RuntimeException("no key");
    }

    public static void main(String[] args) {
        TwentyFirst<Building> ctt1 = new TwentyFirst<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        TwentyFirst<House> ctt2 = new TwentyFirst<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
    }
}

