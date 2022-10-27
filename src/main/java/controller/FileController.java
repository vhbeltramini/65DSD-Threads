package controller;

import model.MalhaViaria;
import model.RoadTypes;
import model.section.AbstractSection;
import model.section.NormalSection;
import utils.FileInterpreter;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class FileController extends Controller {

    private File file;

    public FileController() {
        super();
    }

    public void setFile(File file) {
        this.file = file;
    }

    public MalhaViaria criarMapa() {
        List<Integer> stopCells = RoadTypes.getStopCells();
        FileInterpreter fileInterpreter = new FileInterpreter(file);
        int linhas = Integer.parseInt(fileInterpreter.lerLinha(0));
        int colunas = Integer.parseInt(fileInterpreter.lerLinha(1));
        AbstractSection[][] celulas = new AbstractSection[linhas][colunas];
        char c;
        for (int i = 2; i < fileInterpreter.contarLinhas(); i++) {
            int columnCount = 0;
            String linha = fileInterpreter.lerLinha(i);
            for (int j = 0; j < linha.length(); j++) {
                if (!Character.isWhitespace((c = linha.charAt(j)))) {
                    String total = "" + c;
                    if (linha.length() > (j + 1)) {
                        char aux = linha.charAt(j + 1);
                        total += !Character.isWhitespace(aux) ? aux : "";
                        j++;
                    }
                    int roadValue = Integer.parseInt(total);
                    NormalSection section = new NormalSection();
                    String path = RoadTypes.getRoadType(roadValue);
                    section.setIcon(new ImageIcon(getClass().getResource(path)));
                    if (stopCells.contains(roadValue)) {
                        section.setStopCell(true);
                    }
                    int row = i - 2;
                    section.setRow(row);
                    section.setColumn(columnCount);
                    celulas[row][columnCount] = section;
                    columnCount++;
                }
            }
        }

        return new MalhaViaria.MalhaViariaBuilder().altura(linhas).largura(colunas).celulas(celulas).build();
    }
}
