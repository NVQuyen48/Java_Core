package main.java.Entity;

public class Position {
    int positionId;
    String positionName;

    public Position(int id, String name) {
        this.positionId = id;
        this.positionName = name;
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
