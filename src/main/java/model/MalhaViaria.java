package model;

import model.section.AbstractSection;

import java.util.ArrayList;
import java.util.List;

public class MalhaViaria {
    AbstractSection[][] celulas;

    // linhas
    private int altura;

    // colunas
    private int largura;

    public MalhaViaria(MalhaViariaBuilder malhaViariaBuilder) {
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

    public AbstractSection[][] getCelulas() {
        return celulas;
    }

    public static class MalhaViariaBuilder {
        private int altura;
        private int largura;

        private AbstractSection[][] celulas;

        public MalhaViariaBuilder altura(int altura) {
            this.altura = altura;
            return this;
        }

        public MalhaViariaBuilder largura(int largura) {
            this.largura = largura;
            return this;
        }

        public MalhaViariaBuilder celulas(AbstractSection[][] celulas) {
            this.celulas = celulas;
            return this;
        }

        public MalhaViaria build() {
            return new MalhaViaria(this);
        }
    }
}
