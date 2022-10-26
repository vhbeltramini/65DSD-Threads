package utils;

import java.io.*;

public class FileInterpreter {

    BufferedReader bufferedReader;

    public FileInterpreter(File file) throws FileNotFoundException {
        this.bufferedReader = new BufferedReader(new FileReader(file));
    }

    public String lerLinha(int linha) throws Exception {
        String ln;
        int count = 0;
        while ((ln = this.bufferedReader.readLine()) != null) {
            if (count == linha) {
                return ln;
            }
            count++;
        }
        throw new Exception("Numero de linhas inferior a solicitada");
    }

    public int contarLinhas() throws IOException {
        int count = 0;
        while (this.bufferedReader.readLine() != null) {
            count++;
        }
        return count;
    }
}
