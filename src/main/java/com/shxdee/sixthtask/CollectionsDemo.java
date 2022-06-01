package com.shxdee.sixthtask;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    // 1
    public static int countStringsByFirstChar(List<String> list, char a) {
        int count = 0;
        for (String s : list) {
            if (s != null && !s.equals("") && s.toCharArray()[0] == a) {
                count++;
            }
        }
        return count;
    }
}