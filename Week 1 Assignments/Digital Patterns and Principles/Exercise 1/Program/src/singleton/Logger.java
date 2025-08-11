package singleton;

public class Logger 
{
    //ensures changes are visible across threads
    private static volatile Logger instance = null;
    //prevents external instantiation
    private Logger() 
    {
        System.out.println("Logger instance created");
    }
    //thread-safe lazy initialization (Double-Checked Locking)
    public static Logger getInstance() 
    {
        if (instance == null) 
        {
            synchronized (Logger.class) 
            {
                if (instance == null) 
                {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    public void log(String message) 
    {
        System.out.println("[LOG]: " + message);
    }
}
