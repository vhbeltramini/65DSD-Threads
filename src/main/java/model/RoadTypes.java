package model;

import java.util.HashMap;

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
