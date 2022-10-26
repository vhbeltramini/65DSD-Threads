package model;

import java.util.HashMap;

public enum RoadTypes {

    ZERO(0,"img/background.png"),
    ONE(1,"img/seta-cima.png"),
    TWO(2,"img/seta-direita.png"),
    THREE(3,"img/seta-baixo.png"),
    FOUR(4,"img/seta-esquerda.png"),
    FIVE(5,"img/cruzamento.png"),
    SIX(6,"img/cruzamento.png"),
    SEVEN(7,"img/cruzamento.png"),
    EIGHT(8,"img/cruzamento.png"),
    NINE(9,"img/cruzamento.png"),
    TEN(10,"img/cruzamento.png"),
    ELEVEN(11,"img/cruzamento.png"),
    TWELVE(12,"img/cruzamento.png");

    private int number;
    private String filePath;
    private HashMap<Integer, String> allRoadTypes = new HashMap<>();


    private RoadTypes(int number, String filePath) {
        this.number   = number;
        this.filePath = filePath;
    }

    public static String getRoadType(int number) {
        for (RoadTypes roadType : RoadTypes.values()) {
            if (roadType.number == number)
                return roadType.toString();
        }
        return null;
    }

    @Override
    public String toString() {
        return this.filePath;
    }


}
