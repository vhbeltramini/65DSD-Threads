package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInterpreter {

    List<String> linhas;

    public FileInterpreter(File file) {
        linhas = new ArrayList<>();
        try {
            preencherArray(new BufferedReader(new FileReader(file)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void preencherArray(BufferedReader bufferedReader) throws IOException {
        String ln;
        while ((ln = bufferedReader.readLine()) != null) {
            linhas.add(ln);
        }
    }

    public String lerLinha(int linha) {
        return linhas.get(linha);
    }

    public int contarLinhas() {
        return linhas.size();
    }
}
