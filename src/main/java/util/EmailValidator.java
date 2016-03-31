package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class EmailValidator.
 */
public class EmailValidator
{

	/**
	 * Validate.
	 *
	 * @param email
	 *            the email
	 * @return true, if successful
	 */
	public static boolean validate(String email)
	{
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}