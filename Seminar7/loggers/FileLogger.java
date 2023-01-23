package loggers;

import java.util.Date;

public class FileLogger implements Loggable {
    FileLoggerOperation fileLoggerOperation;
    public FileLogger(FileLoggerOperation fileLoggerOperation){
        this.fileLoggerOperation = fileLoggerOperation;
    }

    @Override
    public void saveLog(String message) {
        fileLoggerOperation.saveLogToFile(new Date() + ": " + message);
    }
}
