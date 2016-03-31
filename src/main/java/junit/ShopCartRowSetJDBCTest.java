package junit;

import org.junit.After;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.ShopCartRowJDBC;
import persist.jdbc.ShopCartRowSetJDBC;

/**
 * The Class ShopCartRowSetJDBCTest.
 */
public class ShopCartRowSetJDBCTest extends TestCase
{

	@After
	public void tearDown()
	{
	}

	/**
	 * Test create empty shop cart row set jdbc.
	 */
	@Test
	public void testCreateEmptyShopCartRowSetJDBC()
	{

		ShopCartRowSetJDBC shopCartRowSetJDBC = new ShopCartRowSetJDBC();

		assertTrue("A new shopCartRowSetJDBC should be empty", shopCartRowSetJDBC.isEmpty());
		assertEquals("A new shopCartRowSetJDBC has no element", 0, shopCartRowSetJDBC.size());
	}

	/**
	 * Test add.
	 */
	@Test
	public void testAdd()
	{

		ShopCartRowSetJDBC shopCartRowSetJDBC = new ShopCartRowSetJDBC();
		ShopCartRowJDBC shopCartRowJDBC = new ShopCartRowJDBC();

		shopCartRowSetJDBC.addShopCartRow(shopCartRowJDBC);

		assertFalse("The shopCartRowSetJDBC must be not empty", shopCartRowSetJDBC.isEmpty());
		assertEquals("The shopCartRowSetJDBC constains 1 item", 1, shopCartRowSetJDBC.size());
	}

}