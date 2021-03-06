package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The Class HashText.
 */
public class HashText
{

	/**
	 * Sha1.
	 *
	 * @param input the input
	 * @return the hashed string
	 */
	public static String sha1(String input)
	{
		MessageDigest mDigest = null;
		try
		{
			mDigest = MessageDigest.getInstance("SHA1");
		} catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] result = mDigest.digest(input.getBytes());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++)
		{
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}

		return sb.toString();
	}

}
