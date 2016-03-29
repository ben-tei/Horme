package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.WrongLoginException;
import junit.framework.TestCase;
import persist.jdbc.UserJDBC;
import util.HashText;

public class UserJDBCTest extends TestCase {

	protected UserJDBC userJDBC;

	@Before
	public void setUp() throws WrongLoginException {
		userJDBC = new UserJDBC();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void test() {
		String login = "abc";
		String password = "abc";

		String encryptedPassword = "a9993e364706816aba3e25717850c26c9cd0d89d";
		password = HashText.sha1(password);

		userJDBC.setLogin(login);
		userJDBC.setPassword(password);

		assertNotNull(userJDBC);
		assertEquals(login, userJDBC.getLogin());
		assertEquals(encryptedPassword, userJDBC.getPassword());

	}

}