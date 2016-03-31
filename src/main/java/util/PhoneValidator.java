package util;

/**
 * The Class EmailValidator.
 */
public class PhoneValidator
{

	/**
	 * Validate the phone number.
	 *
	 * @param phone the phone number
	 * @return true, if successful
	 */
	public static boolean validate(String phone)
	{
		String regex = "^0[1-9]([-. ]?[0-9]{2}){4}$";
		return phone.matches(regex);
	}
}