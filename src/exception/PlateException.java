package exception;

public class PlateException extends Exception{

	/**
	 * author: Christian Tamayo
	 * Handles different types of exceptions for input plates
	 */
	
	private static final long serialVersionUID = 1L;

	public PlateException(String message, Throwable cause) {
		super(message, cause);
	}

	public PlateException(String message) {
		super(message);
	}

	public PlateException(Throwable cause) {
		super(cause);
	}
	
	

}
