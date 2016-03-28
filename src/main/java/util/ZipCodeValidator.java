package util;

/**
 * The Class EmailValidator.
 */
public class ZipCodeValidator {

	/**
	 * Validate.
	 *
	 * @param email the email
	 * @return true, if successful
	 */
	public static boolean validate(String zip)
	{
		String regex = "^([0-9]{5})$";
		return zip.matches(regex);
	}
}