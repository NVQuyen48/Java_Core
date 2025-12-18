package main.java.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Group {
    int groupId;
    String groupName;
    int creatorId;
    LocalDate createDate;

    public Group(int groupId, String groupName, int creatorId, LocalDate createDate) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                '}';
    }
}
