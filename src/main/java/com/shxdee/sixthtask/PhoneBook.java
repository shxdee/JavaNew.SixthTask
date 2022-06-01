package com.shxdee.sixthtask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<Human, List<String>> humans;

    public PhoneBook() {
        humans = new HashMap<>();
    }

    public void addPhone(Human human, String number) {
        if (number == null) return;
        if (humans.containsKey(human)) {
            humans.get(human).add(number);
        }
    }

    public void removePhone(Human human, String number) {
        if (number == null) return;
        if (humans.containsKey(human)) {
            if (humans.get(human).contains(number)) {
                humans.get(human).remove(number);
            }
        }
    }

    public List<String> getHumansPhone(Human human) {
        List <String> result = null;
        if (humans.containsKey(human)) {
            result = humans.get(human);
        }
        return result;
    }

    public Human getHumanByPhoneNumber(String number) {
        for (Map.Entry<Human, List<String>> item: humans.entrySet()) {
            if (item.getValue().contains(number)) {
                return item.getKey();
            }
        }
        return null;
    }

    public Map<Human, List<String>> getAllHumanByStartLastName(String name) {
        Map<Human, List<String>> result = new HashMap<>();
        for (Map.Entry<Human, List<String>> item: humans.entrySet()) {
            if (item.getKey().getLastName().startsWith(name)) {
                result.put(item.getKey(), item.getValue());
            }
        }
        return result;
    }
}
