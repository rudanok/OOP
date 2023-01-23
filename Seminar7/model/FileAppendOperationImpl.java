package model;

import loggers.FileLoggerOperation;

import java.io.*;

public class FileAppendOperationImpl implements FileLoggerOperation {

    private final String fileName;

    public FileAppendOperationImpl(String fileName) {
        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void saveLogToFile(String line) {
        FileWriter writer;
        try {
            writer = new FileWriter(fileName, true);
            writer.write(line);
            writer.append("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}