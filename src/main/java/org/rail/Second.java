package org.rail;

public class Second {

    class SecondHolder<T> {
        T object1;

        public SecondHolder(T object1, T object2, T object3) {
            this.object1 = object1;
            this.object2 = object2;
            this.object3 = object3;
        }

        T object2;
        T object3;

        public void setObject1(T object1) {
            this.object1 = object1;
        }

        public void setObject2(T object2) {
            this.object2 = object2;
        }

        public void setObject3(T object3) {
            this.object3 = object3;
        }

        public T getObject1() {
            return object1;
        }

        public T getObject2() {
            return object2;
        }

        public T getObject3() {
            return object3;
        }
    }
}
