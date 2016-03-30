package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.WrongLoginException;
import junit.framework.TestCase;
import persist.jdbc.ObjectiveJDBC;

public class ObjectiveJDBCTest extends TestCase {

	protected ObjectiveJDBC objectiveJDBC;

	@Before
	public void setUp() {
		objectiveJDBC = new ObjectiveJDBC();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void test() {
		String description = "Je suis un objectif";

		objectiveJDBC.setDescription(description);

		assertNotNull(objectiveJDBC);
		assertEquals(description, objectiveJDBC.getDescription());

	}

}