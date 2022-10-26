package view;

import model.MalhaViaria;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MalhaViariaView extends JFrame {

    private static final int NADA = 0;
    private static final int ESTRADA_CIMA = 1;
    private static final int ESTRADA_DIREITA = 2;
    private static final int ESTRADA_BAIXO = 3;
    private static final int ESTRADA_ESQUERDA = 4;
    private static final int CRUZAMENTO_CIMA = 5;
    private static final int CRUZAMENTO_DIREITA = 6;
    private static final int CRUZAMENTO_BAIXO = 7;
    private static final int CRUZAMENTO_ESQUERDA = 8;
    private static final int CRUZAMENTO_CIMA_DIREITA = 9;
    private static final int CRUZAMENTO_CIMA_ESQUERDA = 10;
    private static final int CRUZAMENTO_DIREITA_BAIXO = 11;
    private static final int CRUZAMENTO_BAIXO_ESQUERDA = 12;

    public MalhaViariaView(MalhaViaria malhaViaria) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);
        JPanel jp_painelPrincipal = new JPanel(new GridLayout());
        this.add(jp_painelPrincipal);
    }
}
