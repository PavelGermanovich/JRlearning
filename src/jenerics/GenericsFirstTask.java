package jenerics;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

public class GenericsFirstTask {
    static class Pair<T, V>{
        private T theFirstValue;
        private V theSecondValue;
        private Pair(T t, V v){
            theFirstValue = t;
            theSecondValue = v;
        }

        public static <T, V> Pair<T, V> of (T t, V v){
            return new Pair(t,v);
        }
        public T getFirst () {
            return theFirstValue;
        }

        public V getSecond() {
            return theSecondValue;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(theFirstValue, pair.theFirstValue) &&
                    Objects.equals(theSecondValue, pair.theSecondValue);
        }

        @Override
        public int hashCode () {
            return Objects.hash(theFirstValue, theSecondValue);
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");

        Comparator<String[]> sortByWordsLength = new Comparator<String[]>() {
            @Override
            public int compare (String[] o1, String[] o2) {
                int length1 = 0;
                int length2 = 0;
                for (String s : o1) {
                    length1 += s.length();
                }
                for (String s : o2) {
                    length2 += s.length();
                }
                return length1 - length2;
            }
        };

    }
}
