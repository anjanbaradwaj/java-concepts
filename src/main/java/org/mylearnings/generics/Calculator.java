package org.mylearnings.generics;

public class Calculator {
    public <T> Integer add(T... params) {
        Integer sum = 0;
        if (params.length == 0) {
            return 0;
        }
        for (T param : params) {
            sum += (Integer) param;
        }
        return sum;
    }
}
