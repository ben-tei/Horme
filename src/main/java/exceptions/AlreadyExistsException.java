package exceptions;

/**
 * The Class AlreadyExistsException.
 */
public class AlreadyExistsException extends Exception
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new already exists exception.
	 *
	 * @param message the message
	 */
	public AlreadyExistsException(String message)
	{
		super(message);
	}

}
