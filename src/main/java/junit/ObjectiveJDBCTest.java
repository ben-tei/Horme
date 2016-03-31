package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.WrongLoginException;
import junit.framework.TestCase;
import persist.jdbc.ObjectiveJDBC;

/**
 * The Class ObjectiveJDBCTest.
 */
public class ObjectiveJDBCTest extends TestCase
{

	/** The objective jdbc. */
	protected ObjectiveJDBC objectiveJDBC;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp()
	{
		objectiveJDBC = new ObjectiveJDBC();
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
		String description = "Je suis un objectif";

		objectiveJDBC.setDescription(description);

		assertNotNull(objectiveJDBC);
		assertEquals(description, objectiveJDBC.getDescription());

	}

}