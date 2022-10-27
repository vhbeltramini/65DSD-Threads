package model.section;

import model.Car;

import javax.swing.*;

public abstract class AbstractSection {

    protected int row;
    protected int column;
    protected Icon icon;
    protected Car car;
    protected boolean stopCell;
    protected boolean lastCell;
    protected int moveDirection;


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isStopCell() {
        return stopCell;
    }

    public void setStopCell(boolean stopCell) {
        this.stopCell = stopCell;
    }

    public boolean isLastCell() {
        return lastCell;
    }

    public void setLastCell(boolean lastCell) {
        this.lastCell = lastCell;
    }
}
