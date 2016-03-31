package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.WrongLoginException;
import junit.framework.TestCase;
import persist.jdbc.ProductJDBC;

/**
 * The Class ProductJDBCTest.
 */
public class ProductJDBCTest extends TestCase
{

	/** The product jdbc. */
	protected ProductJDBC productJDBC;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws WrongLoginException
	{
		productJDBC = new ProductJDBC();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
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
		String name = "My name is product";

		productJDBC.setName(name);

		assertNotNull(productJDBC);
		assertEquals(name, productJDBC.getName());

	}

}
