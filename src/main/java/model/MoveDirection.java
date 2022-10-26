package model;

public enum MoveDirection {

    UP("img/carro-cima.png", 1),
    RIGHT("img/carro-direita.png", 2),
    DOWN("img/carro-baixo.png", 3),
    LEFT("img/carro-esquerda.png", 4);

    private String filePath;
    private int side;

    private MoveDirection(String filePath, int side) {
        this.filePath = filePath;
        this.side = side;
    }

    public String toString() {
        return filePath;
    }

    public static String getMoveDirection(int side) {
        for (MoveDirection moveType : MoveDirection.values()) {
            if (moveType.side == side)
                return moveType.toString();
        }
        return null;
    }


}
