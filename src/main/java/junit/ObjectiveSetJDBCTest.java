package junit;

import org.junit.After;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.ObjectiveJDBC;
import persist.jdbc.ObjectiveSetJDBC;

public class ObjectiveSetJDBCTest extends TestCase {

	@After
	public void tearDown() {
	}

	@Test
	public void testCreateEmptyObjectiveSetJDBC() {

		ObjectiveSetJDBC objectiveSetJDBC = new ObjectiveSetJDBC();

		assertNotNull(objectiveSetJDBC);
		assertTrue("A new objectiveSetJDBC should be empty", objectiveSetJDBC.isEmpty());
		assertEquals("A new objectiveSetJDBC has no element", 0, objectiveSetJDBC.size());
	}

	@Test
	public void testAdd() {

		ObjectiveSetJDBC objectiveSetJDBC = new ObjectiveSetJDBC();
		ObjectiveJDBC objectiveJDBC = new ObjectiveJDBC();

		objectiveSetJDBC.addObjective(objectiveJDBC);

		assertNotNull(objectiveSetJDBC);
		assertNotNull(objectiveJDBC);
		assertFalse("The objectiveSetJDBC must be not empty", objectiveSetJDBC.isEmpty());
		assertEquals("The objectiveSetJDBC constains 1 item", 1, objectiveSetJDBC.size());
	}

}