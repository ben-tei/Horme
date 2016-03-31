package junit;

import org.junit.After;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.ProductSetJDBC;

/**
 * The Class SearchProductTest.
 */
public class SearchProductTest extends TestCase
{

	/** The product set. */
	ProductSetJDBC productSet;

	@After
	public void tearDown()
	{
	}

	/**
	 * Test search.
	 */
	@Test
	public void testSearch()
	{

		String name;
		this.productSet = new ProductSetJDBC("Tennis racket");

		name = productSet.getProductByIndex(0).getName();

		assertEquals("Search is ok", "Tennis racket", name);
	}

}
