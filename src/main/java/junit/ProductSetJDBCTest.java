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
	public void testAdd() {

		ProductSetJDBC productSetJDBC = new ProductSetJDBC(null);
		ProductJDBC productJDBC = new ProductJDBC();

		productSetJDBC.addProduct(productJDBC);

		assertFalse("The ProductSetJDBC must be not empty", productSetJDBC.isEmpty());
		assertEquals("The ProductSetJDBC contains 1 item", 1, productSetJDBC.size());
	}
}
