package com.jhj.core.generic.pair;

public class ArrayAlg {
    public static Pair<String> getMinMaxPair(String [] s) {
        if (s == null || s.length == 0) return null;
         String min = s[0];
         String max = s[0];
         for (int i = 1; i < s.length; i++) {
             if (min.compareTo(s[i]) > 0) {
                 min = s[i];
             }
             if (max.compareTo(s[i]) < 0)
                 max = s[i];
         }
         return new Pair<>(min, max);
    }

    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "d", "mary", "had", "little"};
        Pair<String > p = getMinMaxPair(s);
        int i = s[0].compareTo(s[4]);
        System.out.println(p);
    }
}
