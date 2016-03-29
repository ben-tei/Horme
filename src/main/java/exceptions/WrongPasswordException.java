package exceptions;

/**
 * The Class WrongPasswordException.
 */
public class WrongPasswordException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new wrong password exception.
	 *
	 * @param message
	 *            the message
	 */
	public WrongPasswordException(String message) {
		super(message);
	}

}
