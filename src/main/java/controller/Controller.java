package controller;

import observer.Observer;
import observer.Subject;
import utils.FileInterpreter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class Controller implements Subject {

    List<Observer> observers;

    public Controller() {
        observers = new ArrayList<>();
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
