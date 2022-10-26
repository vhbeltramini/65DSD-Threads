package model;

import java.util.ArrayList;
import java.util.List;

public class MalhaViaria {
    List<Integer> celulas;
    private int altura;
    private int largura;

    public MalhaViaria(MalhaViariaBuilder malhaViariaBuilder) {
        celulas = new ArrayList<>();
        this.altura = malhaViariaBuilder.altura;
        this.largura = malhaViariaBuilder.largura;
        this.celulas = malhaViariaBuilder.celulas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public static class MalhaViariaBuilder {
        private int altura;
        private int largura;

        private List<Integer> celulas;

        public MalhaViariaBuilder altura(int altura) {
            this.altura = altura;
            return this;
        }

        public MalhaViariaBuilder largura(int largura) {
            this.largura = largura;
            return this;
        }

        public MalhaViariaBuilder celulas(List<Integer> celulas) {
            this.celulas = celulas;
            return this;
        }

        public MalhaViaria build() {
            return new MalhaViaria(this);
        }
    }
}
