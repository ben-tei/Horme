package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.CategoryJDBC;

/**
 * The Class CategoryJDBCTest.
 */
public class CategoryJDBCTest extends TestCase
{

	/** The category jdbc. */
	protected CategoryJDBC categoryJDBC;

	@Before
	public void setUp()
	{
		categoryJDBC = new CategoryJDBC();
	}

	@After
	public void tearDown()
	{
	}

	/**
	 * Test.
	 */
	@Test
	public void test()
	{
		String shortDescription = "Je suis un categorie";

		categoryJDBC.setShortDescription(shortDescription);

		assertNotNull(categoryJDBC);
		assertEquals(shortDescription, categoryJDBC.getShortDescription());

	}

}
