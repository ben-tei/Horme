package util;

/**
 * The Class EmailValidator.
 */
public class ZipCodeValidator
{

	/**
	 * Validate the zip code.
	 *
	 * @param zip the zip code
	 * @return true, if successful
	 */
	public static boolean validate(String zip)
	{
		String regex = "^([0-9]{5})$";
		return zip.matches(regex);
	}
}