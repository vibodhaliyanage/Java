import java.time.LocalDateTime;

public class Logger {
   private static Logger logger = new Logger();

    private Logger() { }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}
