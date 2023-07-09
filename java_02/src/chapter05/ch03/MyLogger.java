package chapter05.ch03;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    Logger logger = Logger.getLogger("mylogger"); // 로거는 싱글톤.


    // 로깅레벨

    public static final String errLog = "log.txt";
    public static final String waringLog = "warning.txt";
    public static final String fineLog = "fine.txt";

    private FileHandler logFile;
    private FileHandler warningFile;
    private FileHandler fineFile;

    /// 싱글톤 적용. .
    private static MyLogger instance = new MyLogger();
    private MyLogger(){
        try {
            logFile = new FileHandler(errLog, true); // 새로쓰고싶다면 fasle
            warningFile = new FileHandler(waringLog, true);
            fineFile = new FileHandler(fineLog, true);

        } catch (SecurityException e) {
           e.printStackTrace();
        } catch (IOException e)   {
            e.printStackTrace();
        }
        logFile.setFormatter(new SimpleFormatter());
        warningFile.setFormatter(new SimpleFormatter());
        fineFile.setFormatter(new SimpleFormatter());

        logger.setLevel(Level.ALL);
        fineFile.setLevel(Level.FINE);
        warningFile.setLevel(Level.SEVERE);

        logger.addHandler(logFile);
        logger.addHandler(warningFile);
        logger.addHandler(fineFile);
    }

    public static MyLogger getLogger(){
        return instance;
    }


    public void log(String msg){
        logger.finest(msg);
        logger.finer(msg);
        logger.fine(msg);
        logger.config(msg);
        logger.info(msg);
        logger.warning(msg);
        logger.severe(msg);
    }

    public void fine(String msg){
        logger.fine(msg);
    }
    public void warning(String msg){
        logger.warning(msg);
    }
}
