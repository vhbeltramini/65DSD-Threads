package controller;

import observer.Observer;
import observer.Subject;
import utils.FileInterpreter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileController implements Subject {

    private File file;
    private List<Observer> observers;

    public FileController() {
        observers = new ArrayList<>();
    }

    public void setFile(File file) {
        this.file = file;
        this.notificar();
    }

    // por enquanto mocado
    public ArrayList<Integer> criarMapa() {
        FileInterpreter fileInterpreter = new FileInterpreter(file);
        return new ArrayList<>();
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
