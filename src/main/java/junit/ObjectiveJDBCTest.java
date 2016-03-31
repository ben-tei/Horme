package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.ObjectiveJDBC;

/**
 * The Class ObjectiveJDBCTest.
 */
public class ObjectiveJDBCTest extends TestCase
{

	/** The objective jdbc. */
	protected ObjectiveJDBC objectiveJDBC;

	@Before
	public void setUp()
	{
		objectiveJDBC = new ObjectiveJDBC();
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
		String description = "Je suis un objectif";

		objectiveJDBC.setDescription(description);

		assertNotNull(objectiveJDBC);
		assertEquals(description, objectiveJDBC.getDescription());

	}

}