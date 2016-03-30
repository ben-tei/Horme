package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.WrongLoginException;
import junit.framework.TestCase;
import persist.jdbc.CategoryJDBC;


public class CategoryJDBCTest extends TestCase {
	
	protected CategoryJDBC categoryJDBC;

	@Before
	public void setUp() throws WrongLoginException {
		categoryJDBC = new CategoryJDBC();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void test() {
		String shortDescription = "Je suis un catégorie";

		categoryJDBC.setShortDescription(shortDescription);

		assertNotNull(categoryJDBC);
		assertEquals(shortDescription, categoryJDBC.getShortDescription());

	}

}
