package controller;

import model.MalhaViaria;
import observer.Observer;
import observer.Subject;
import utils.FileInterpreter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileController extends Controller {

    private File file;

    public FileController() {
        super();
    }

    public void setFile(File file) {
        this.file = file;
        this.notificar();
    }

    // por enquanto mocado
    public MalhaViaria criarMapa() {
        FileInterpreter fileInterpreter = new FileInterpreter(file);
        List<Integer> retorno = new ArrayList<>();
        char c;
        for (int i = 2; i < fileInterpreter.contarLinhas(); i++) {
            String linha = fileInterpreter.lerLinha(i);
            for (int j = 0; j < linha.length(); j++) {
                if ((c = linha.charAt(j)) != ' ') {
                    retorno.add(Integer.parseInt(String.valueOf(c)));
                }
            }
        }

        return new MalhaViaria.MalhaViariaBuilder().altura(Integer.getInteger(fileInterpreter.lerLinha(0)))
                .largura(Integer.getInteger(fileInterpreter.lerLinha(1)))
                .celulas(retorno)
                .build();
    }
}
