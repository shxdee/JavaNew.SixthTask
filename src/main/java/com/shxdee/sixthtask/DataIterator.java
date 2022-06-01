package com.shxdee.sixthtask;

import java.util.Arrays;
import java.util.Iterator;

public class DataIterator implements Iterator<Integer> {
    private Data data;
    private Group group;
    private int id;
    private Iterator<Integer> list;

    public DataIterator(Data data) {
        this.data = data;
        id = 0;
        group = data.getGroups()[id];
        list = Arrays.stream(group.getData()).iterator();
    }

    @Override
    public boolean hasNext() {
        if (!list.hasNext()) {
            id++;
            if (data.getGroups().length > id) {
                group = data.getGroups()[id];
                list = Arrays.stream(group.getData()).iterator();
            }
        }
        return list.hasNext();
    }

    @Override
    public Integer next() {
        return list.next();
    }

    @Override
    public void remove() {
        list.remove();
    }
}
