package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileMaster implements FileMasterInterface {
    private FormatterInterface formatter;
    private String path;

    public FileMaster(FormatterInterface formatter) {
        this.formatter = formatter;
    }

    public void exportData(int id, String name, int count, int dropProbability) {
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            fw.write(formatter.returnFormated(id, name, count, dropProbability));
            fw.flush();
        } catch (IOException e) {
            System.out.println("ERROR: Данные не будут записаны в файл");
        }
    }
}
