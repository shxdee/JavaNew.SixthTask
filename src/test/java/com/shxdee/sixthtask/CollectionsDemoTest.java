package com.shxdee.sixthtask;


import java.util.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CollectionsDemoTest {

    // 1
    @Test
    public void countStringsByFirstCharTest() {
        List<String> list = new ArrayList<>();
        list.add("Арбуз"); list.add("Автомобиль");
        list.add("Один"); list.add("Огонь");
        list.add("Первый"); list.add("Последний");

        /*List<String> result1 = new ArrayList<>();
        result1.add("Арбуз"); result1.add("Автомобиль");

        List<String> result2 = new ArrayList<>();
        result1.add("Один"); result1.add("Огонь");

        List<String> result3 = new ArrayList<>();
        result1.add("Первый"); result1.add("Последний");*/

        assertEquals(2, CollectionsDemo.countStringsByFirstChar(list, 'А'));
        assertEquals(2, CollectionsDemo.countStringsByFirstChar(list, 'О'));
        assertEquals(2, CollectionsDemo.countStringsByFirstChar(list, 'П'));
    }

}