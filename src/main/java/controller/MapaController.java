package controller;

import model.MalhaViaria;
import model.section.AbstractSection;

public class MapaController {
    private MalhaViaria malhaViaria;
    private static MapaController instance;
    private int numeroCarros;
    private int intervaloCarros;

    private MapaController() {
    }

    public static MapaController getInstance() {
        if (instance == null) {
            instance = new MapaController();
        }
        return instance;
    }

    public int getIntervaloCarros() {
        return intervaloCarros;
    }

    public void setIntervaloCarros(int intervaloCarros) {
        this.intervaloCarros = intervaloCarros;
    }

    public int getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(int numeroCarros) {
        this.numeroCarros = numeroCarros;
    }

    public MalhaViaria getMalhaViaria() {
        return malhaViaria;
    }

    public void setMalhaViaria(MalhaViaria malhaViaria) {
        this.malhaViaria = malhaViaria;
    }

    public AbstractSection retornaCelula(int linha, int coluna) {
        return malhaViaria.getCelulas()[linha][coluna];
    }
}
