package exceptions;

/**
 * The Class WrongLoginException.
 */
public class WrongLoginException extends Exception
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new wrong login exception.
	 *
	 * @param message the message
	 */
	public WrongLoginException(String message)
	{
		super(message);
	}

}
