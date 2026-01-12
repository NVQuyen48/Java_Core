package main.java.Entity;

import main.java.util.ScannerUtils;

public class Position {
    int positionId;
    String positionName;

    public Position(int id, String name) {
        this.positionId = id;
        this.positionName = name;
    }

    public Position() {
        System.out.println("Nhập id:");
        this.positionId = ScannerUtils.inputInt("Nhập lại id position");

        System.out.println("Nhập positionName:");
        this.positionName = ScannerUtils.inputString();
    }

    public Position(String positionName) {
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    ;

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
