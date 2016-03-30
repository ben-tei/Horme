package junit;

import org.junit.After;
import org.junit.Test;
import junit.framework.TestCase;
import persist.jdbc.ProductJDBC;
import persist.jdbc.ProductSetJDBC;


public class ProductSetJDBCTest extends TestCase {

	@After
	public void tearDown() {
	}

	@Test
	public void testCreateEmptyProductSetJDBC() {

		ProductSetJDBC productSetJDBC = new ProductSetJDBC();

		assertNotNull(productSetJDBC);
		assertFalse("A new productSetJDBC should be not empty", productSetJDBC.isEmpty());
		assertTrue("A new productSetJDBC has elements", productSetJDBC.size() > 0);
	}

	@Test
	public void testAdd() {

		ProductSetJDBC productSetJDBC = new ProductSetJDBC();
		ProductJDBC productJDBC = new ProductJDBC();

		productSetJDBC.addProduct(productJDBC);

		assertNotNull(productSetJDBC);
		assertNotNull(productJDBC);
		assertFalse("The productSetJDBC must be not empty", productSetJDBC.isEmpty());
		assertTrue("The productSetJDBC has elements", productSetJDBC.size() > 0);
	}

}
