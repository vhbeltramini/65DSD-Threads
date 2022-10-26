package model;

public class Car extends Thread {

    private int row;
    private int column;
    private int speed;
    private boolean outOfRoad;

    @Override
    public void run() {
        super.run();
    }

    private void validateFollowingPath() {

    }

    private void validateIntersection() {

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOutOfRoad() {
        return outOfRoad;
    }

}
