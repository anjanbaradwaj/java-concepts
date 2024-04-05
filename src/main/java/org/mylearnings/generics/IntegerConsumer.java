package org.mylearnings.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerConsumer implements Consumer<Integer>{
    List<Integer> intList = new ArrayList<>();
    @Override
    public boolean consume(Integer param) {
        return param > 10 ?false : intList.add(param);
    }


}
