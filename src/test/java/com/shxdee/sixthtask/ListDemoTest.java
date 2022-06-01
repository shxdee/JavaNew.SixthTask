package com.shxdee.sixthtask;

import java.util.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class ListDemoTest {

    // 2
    @Test
    public void getNamesakesTest() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Проскурин", "Антон", "Владимирович", 10);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        List<Human> humans = new ArrayList<>();
        humans.add(human); humans.add(human1); humans.add(human2);
        humans.add(human3); humans.add(human4);

        List<Human> result = new ArrayList<>();
        result.add(human); result.add(human3);

        assertEquals(result, ListDemo.getNamesakes(humans, human));
    }

    // 3
    @Test
    public void getListWithoutHumanTest() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 20);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        List<Human> humans = new ArrayList<>();
        humans.add(human); humans.add(human1); humans.add(human2);
        humans.add(human3); humans.add(human4);

        List<Human> result = new ArrayList<>();
        result.add(human); result.add(human1); result.add(human2); result.add(human3);

        List<Human> get = ListDemo.getListWithoutHuman(humans, human4);
        assertEquals(result, get);

        human.setFirstName("O");
        assertNotEquals(result, get);
    }

    // 4
    @Test
    public void getListSetWithoutIntersectionTest() {
        List<Set<Integer>> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> set3 = new HashSet<>();

        List<Set<Integer>> result = new ArrayList<>();

        set.add(1); set.add(2); set.add(3);
        set1.add(4); set1.add(5); set1.add(6);
        set2.add(7); set2.add(8); set2.add(9);
        list.add(set); list.add(set1); list.add(set2);

        set3.add(11); set3.add(1); set3.add(111);

        result.add(set1); result.add(set2);

        assertEquals(result, ListDemo.getListSetWithoutIntersection(list, set3));
    }

    // 5
    @Test
    public void test235() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 20);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        List<Human> humans = new ArrayList<>();
        humans.add(human); humans.add(human1); humans.add(human2);
        humans.add(human3); humans.add(human4);

        Set<Human> result = new HashSet<>();
        result.add(human3); result.add(human4);

        assertEquals(result, ListDemo.getOldestHumans(humans));
    }



    // 6*
    @Test
    public void test6() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 20);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        Set<Human> humans = new HashSet<>();
        humans.add(human); humans.add(human1); humans.add(human2);
        humans.add(human3); humans.add(human4);

        List<Human> result = new ArrayList<>();
        result.add(human1); result.add(human4); result.add(human3);
        result.add(human); result.add(human2);

        /*
        for(Human item: ListDemo.getSortList(humans)){
            System.out.printf(item.getLastName());
        }
        */

        assertEquals(result, ListDemo.getSortList(humans));
    }

    // 7
    @Test
    public void getSetByIdsTest() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 20);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        Map<Integer, Human> map = new HashMap<>();
        Map<Integer, Human> result = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        set.add(10); set.add(20); set.add(30);

        map.put(10, human); result.put(10, human);
        map.put(20, human2); result.put(20, human2);
        map.put(30, human4); result.put(30, human4);

        assertEquals(result, ListDemo.getSetByIds(map, set));
    }

    // 8
    @Test
    public void getMapHumanOlderThan18Test() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 10);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        Map<Integer, Human> map = new HashMap<>();
        Map<Integer, Human> result = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        set.add(10); set.add(20); set.add(30);


        map.put(10, human);result.put(10, human);
        map.put(20, human2); result.put(20, human2);
        map.put(30, human3);
        map.put(40, human4); result.put(40, human4);

        assertEquals(result, ListDemo.getMapHumanOlderThan18(map));
    }

    // 9
    @Test
    public void getMapHumanIdAgeTest() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 10);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        Map<Integer, Human> map = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        set.add(19); set.add(20); set.add(10);


        map.put(19, human); result.put(19, 19);
        map.put(10, human3); result.put(10, 10);
        map.put(20, human4); result.put(20, 20);

        assertEquals(result, ListDemo.getMapHumanIdAge(map));
    }

    // 10
    @Test
    public void getMapHumanAgeKeyTest() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 19);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        Set<Human> humans = new HashSet<>();
        humans.add(human); humans.add(human1); humans.add(human2);
        humans.add(human3); humans.add(human4);

        Map<Integer, List<Human>> map = new HashMap<>();
        List<Human> result = null;

        result = new ArrayList<>();
        result.add(human3); result.add(human);
        map.put(19, result);

        result = new ArrayList<>();
        result.add(human2);  result.add(human1);
        map.put(18, result);

        result = new ArrayList<>();
        result.add(human4);
        map.put(20, result);

        assertEquals(map, ListDemo.getMapHumanAgeKey(humans));
    }

    // 11*
    @Test
    public void getMapHumanAgeAndNameKeyTest() {
        Human human = new Human("Проскурин", "Евгений", "Юрьевич", 19);
        Human human1 = new Human("Арбузов", "Дмитрий", "Олегович", 18);
        Human human2 = new Human("Телегин", "Матвей", "Александрович", 18);
        Human human3 = new Human("Прикольный", "Антон", "Владимирович", 19);
        Human human4 = new Human("Васильев", "Василий", "Васильевич", 20);

        Set<Human> humans = new HashSet<>();
        humans.add(human); humans.add(human1); humans.add(human2);
        humans.add(human3); humans.add(human4);

        Map<Integer, Map<Character, List<Human>>> map = new HashMap<>();

        Map<Character, List<Human>> map1 = new HashMap<>();
        List<Human> list = new ArrayList<>();
        list.add(human2);
        map1.put('Т', list);
        list = new ArrayList<>();
        list.add(human1);
        map1.put('А', list);
        map.put(18, map1);

        map1 = new HashMap<>();
        list = new ArrayList<>();
        list.add(human3); list.add(human);
        map1.put('П', list);
        map.put(19,map1);

        map1 = new HashMap<>();
        list = new ArrayList<>();
        list.add(human4);
        map1.put('В', list);
        map.put(20,map1);

        assertEquals(map, ListDemo.getMapHumanAgeAndNameKey(humans));
    }
}