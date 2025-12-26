package main.java.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Group {
    int groupId;
    public String groupName;
    Account[] accounts;
    int creatorId;
    LocalDate createDate;

    public Group(int groupId, String groupName, int creatorId, LocalDate createDate) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public Group() {
        this.groupId = 0;
        this.groupName = null;
        this.creatorId = 0;
        this.createDate = LocalDate.now();
    }

    public Group(String groupName, int creatorId, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String groupName, int creatorId, String[] userName, LocalDate createDate) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.accounts = new Account[userName.length];
        for (int i = 0; i < userName.length; i++) {
            Account account = new Account();
            account.userName = userName[i];
            this.accounts[i] = account;
        }
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
