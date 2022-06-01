package com.shxdee.sixthtask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataDemo {
    public static List<Integer> getAll(Data data) {
        Iterator<Integer> iterator = data.iterator();
        List<Integer> result = new ArrayList<>();

        while(iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }
}
