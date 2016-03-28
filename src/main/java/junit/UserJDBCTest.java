package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.WrongLoginException;
import junit.framework.TestCase;
import persist.jdbc.UserJDBC;

public class UserJDBCTest extends TestCase {

	protected UserJDBC userJDBC;

	@Before
	public void setUp() throws WrongLoginException {
		userJDBC = new UserJDBC("abc");
	}

	@After
	public void tearDown() {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(userJDBC.getLogin(), "abc");
	}

}