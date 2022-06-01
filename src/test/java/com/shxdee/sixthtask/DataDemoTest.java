package com.shxdee.sixthtask;


import java.util.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DataDemoTest {

    // 13*
    @Test
    public void testGetAll() {
        Group group = new Group(100, 1, 2, 3);
        Group group1 = new Group(20, 4, 5, 6);
        Group group2 = new Group(40, 7, 8, 9);

        Data data = new Data("Data", group, group1, new Group(1), group2);

        List<Integer> result = new ArrayList<>();
        result.add(1); result.add(2); result.add(3);
        result.add(4); result.add(5); result.add(6);
        result.add(7); result.add(8); result.add(9);

        assertEquals(DataDemo.getAll(data), result);
    }
}