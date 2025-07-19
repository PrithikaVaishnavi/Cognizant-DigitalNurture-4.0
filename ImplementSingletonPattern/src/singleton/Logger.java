package singleton;

public class Logger {

	public Logger() {
		// TODO Auto-generated constructor stub
		System.out.println("Logger instance created.");
	}
	 // Static inner helper class
    private static class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }

    // Global access point
    public static Logger getInstance() {
        return LoggerHelper.INSTANCE;
    }

    // Example log method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
