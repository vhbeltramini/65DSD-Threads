package controller;

import observer.Observer;
import observer.Subject;
import utils.FileInterpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileController implements Subject {

    private File file;
    List<Observer> observers;

    public FileController() {
        observers = new ArrayList<>();
    }

    public void setFile(File file) {
        this.file = file;
        this.notificar();
    }

    // por enquanto mocado
    public List<Integer> criarMapa() {
        FileInterpreter fileInterpreter = new FileInterpreter(file);
        List<Integer> retorno = new ArrayList<>();
        for (int i = 2; i < fileInterpreter.contarLinhas(); i++){
            retorno.add(Integer.getInteger(fileInterpreter.lerLinha(i)));
        }
        return retorno;
    }

    @Override
    public void addObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer observer : observers) {
            observer.atualizar();
        }
    }
}
