package com.shxdee.sixthtask;

import java.util.Iterator;

public class Data implements Iterable<Integer>
{
    private String groupName;
    private Group[] groups;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public int getLength() {
        return groups.length;
    }

    public Data(String groupName, Group... groups) {
        this.groupName = groupName;
        this.groups = groups;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new DataIterator(this);
    }
}
