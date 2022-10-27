package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public enum RoadTypes {

    NADA(0,"/background.png"),
    ESTRADA_CIMA(1,"/seta-cima.png"),
    ESTRADA_DIREITA(2,"/seta-direita.png"),
    ESTRADA_BAIXO(3,"/seta-baixo.png"),
    ESTRADA_ESQUERDA(4,"/seta-esquerda.png"),
    CRUZAMENTO_CIMA(5,"/cruzamento.png"),
    CRUZAMENTO_DIREITA(6,"/cruzamento.png"),
    CRUZAMENTO_BAIXO(7,"/cruzamento.png"),
    CRUZAMENTO_ESQUERDA(8,"/cruzamento.png"),
    CRUZAMENTO_CIMA_DIREITA(9,"/cruzamento.png"),
    CRUZAMENTO_CIMA_ESQUERDA(10,"/cruzamento.png"),
    CRUZAMENTO_DIREITA_BAIXO(11,"/cruzamento.png"),
    CRUZAMENTO_BAIXO_ESQUERDA(12,"/cruzamento.png");

    private int number;
    private String filePath;
    private HashMap<Integer, String> allRoadTypes = new HashMap<>();
    private static final List<Integer> stopCells = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12);;


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

    public static List<Integer> getStopCells(){
        return stopCells;
    }

    @Override
    public String toString() {
        return this.filePath;
    }


}
