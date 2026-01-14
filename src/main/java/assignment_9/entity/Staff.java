package main.java.assignment_9.entity;

public class Staff<K> extends MyMap<K, String> {
    public Staff(K id, String nameStaff) {
        super(id, nameStaff);
    }


    public K getId() {
        return getKey();
    }

    public String getNameStaff() {
        return getValue();
    }
}
