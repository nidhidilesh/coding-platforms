package Singleton;

public class Logger {
    private static int loggerInstance = 0;
    private static Logger loggerInst = null;
    private Logger(){
        System.out.println("New logger instance created "+ (++loggerInstance));
    }
    static synchronized Logger getLogger(){
        if(loggerInst == null){
            loggerInst = new Logger();
        }
        return loggerInst;
    }
}
