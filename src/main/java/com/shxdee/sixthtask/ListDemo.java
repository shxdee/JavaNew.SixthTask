package com.shxdee.sixthtask;

import java.util.*;

public class ListDemo {

    // 2
    public static List<Human> getNamesakes(List<Human> humans, Human human) {
        List<Human> result = new ArrayList<>();
        for (Human item: humans) {
            if (human.getLastName().equals(item.getLastName())) {
                result.add(item);
            }
        }
        return  result;
    }

    // 3
    public static List<Human> getListWithoutHuman(List<Human> humans, Human human) {
        List<Human> result = new ArrayList<>();

        for(Human item: humans) {
            if (!item.equals(human)) {
                Human temp = new Human(item);
                result.add(temp);
            }
        }
        return result;
    }

    // 4
    public static List<Set<Integer>> getListSetWithoutIntersection(List<Set<Integer>> data, Set<Integer> set) {
        List<Set<Integer>> result = new ArrayList<>();

        for (Set<Integer> item: data) {
            Set<Integer> temp = new HashSet<>(item);
            result.add(temp);
        }

        List<Set<Integer>> res = new ArrayList<>();
        int i = 0;
        for (Set<Integer> item: result) {
            item.retainAll(set);
            if (item.size() == 0) {
                res.add(data.get(i));
            }
            i++;
        }
        return res;
    }

    // 5
    public static Set<Human> getOldestHumans(List<Human> humans) {
        int year = 0;
        Set<Human> result = new HashSet<>();
        for (Human item: humans) {
            year = Math.max(year, item.getAge());
        }
        for (Human item: humans) {
            if (item.getAge() == year) {
                result.add(item);
            }
        }
        return result;
    }

    // 6*
    public static List<? extends Human> getSortList(Set<? extends Human> set) {
        Set<? extends Human> setBuf = new TreeSet<>(set);
        List<? extends Human> result = new ArrayList<>(setBuf);
        return result;
    }

    // 7
    public static Map<Integer, Human> getSetByIds(Map<Integer, Human> map, Set<Integer> ids) {
        Map<Integer, Human> result = new HashMap<>();

        for(Integer item: ids) {
            if (map.containsKey(item)) {
                result.put(item, map.get(item));
            }
        }

        return result;
    }

    // 8
    public static Map<Integer, Human> getMapHumanOlderThan18(Map<Integer, Human> map) {
        Map<Integer, Human> result = new HashMap<>();

        for(Map.Entry<Integer, Human> item: map.entrySet()) {
            if (item.getValue().getAge() >= 18) {
                result.put(item.getKey(), item.getValue());
            }
        }

        return result;
    }

    // 9
    public static Map<Integer, Integer> getMapHumanIdAge(Map<Integer, Human> map) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Human> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();
            result.put(key, human.getAge());
        }
        return result;
    }

    // 10
    public static Map<Integer, List<Human>> getMapHumanAgeKey(Set<Human> set) {
        Map<Integer, List<Human>> result = new HashMap<>();
        List<Human> array = null;

        for(Human item: set) {
            if (result.containsKey(item.getAge())) {
                array = result.get(item.getAge());
                array.add(item);
            }
            else {
                array = new ArrayList<>();
                array.add(item);
                result.put(item.getAge(), array);
            }
        }

        return result;
    }

    // 11
    public static Map<Integer, Map<Character ,List<Human>>> getMapHumanAgeAndNameKey(Set<Human> set) {
        Map<Integer, Map<Character, List<Human>>> result = new HashMap<>();
        List<Human> array = null;


        for(Human item: set) {
            if (result.containsKey(item.getAge())) {
                if (result.get(item.getAge()).containsKey(item.getLastName().charAt(0))) {
                    array = result.get(item.getAge()).get(item.getLastName().charAt(0));
                    array.add(item);
                }
                else {
                    array = new ArrayList<>();
                    array.add(item);
                    result.get(item.getAge()).put(item.getLastName().charAt(0), array);
                }
            }
            else {
                array = new ArrayList<>();
                array.add(item);
                Map<Character, List<Human>> map = new HashMap<>();
                map.put(item.getLastName().charAt(0), array);
                result.put(item.getAge(), map);
            }
        }
        return result;
    }
}
