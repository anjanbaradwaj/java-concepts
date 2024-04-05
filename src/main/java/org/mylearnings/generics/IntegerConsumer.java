package org.mylearnings.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerConsumer implements Consumer<Integer>{
    List<Integer> intList = new ArrayList<>();
    @Override
    public void consume(Integer param) {
        intList.add(param);
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }
}
