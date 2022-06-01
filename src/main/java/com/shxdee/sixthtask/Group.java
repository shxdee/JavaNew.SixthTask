package com.shxdee.sixthtask;

import java.util.Arrays;
import java.util.Objects;

public class Group {
    private int groupID;
    private int[] data;

    public Group(int groupID, int... data) {
        this.groupID = groupID;
        this.data = data;
    }

    public int getLength() {
        return data.length;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupID == group.groupID && Arrays.equals(data, group.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(groupID);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}
