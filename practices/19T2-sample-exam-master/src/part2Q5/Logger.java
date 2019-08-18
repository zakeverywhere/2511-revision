package part2Q5;
/*
 * Logger class must be intantiated only once in the application; it is to ensure that the
 * complete application makes use of the same logger instance
 */
public class Logger {
	// Complete the implementation
	private static Logger myInstance = new Logger();
	public void log(String s) {
		//a trivial implementation of log where we pass the string to be logged to console
		System.err.println(s);
	}
	public static Logger getLogger() {
		return myInstance;
	}
}