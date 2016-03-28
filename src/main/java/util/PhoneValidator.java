package util;

/**
 * The Class EmailValidator.
 */
public class PhoneValidator {

	/**
	 * Validate.
	 *
	 * @param email the email
	 * @return true, if successful
	 */
	public static boolean validate(String phone)
	{
		String regex = "^0[1-9]([-. ]?[0-9]{2}){4}$";
		return phone.matches(regex);
	}
}