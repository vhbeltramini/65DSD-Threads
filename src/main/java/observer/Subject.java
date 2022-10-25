package observer;

public interface Subject {
    void addObservador(Observer observer);
    void removerObservador(Observer observer);
    void notificar();
}
