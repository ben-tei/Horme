package junit;

import org.junit.After;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.ActivityJDBC;
import persist.jdbc.ActivitySetJDBC;

/**
 * The Class ActivitySetJDBCTest.
 */
public class ActivitySetJDBCTest extends TestCase
{

	@After
	public void tearDown()
	{
	}

	/**
	 * Test create empty activity set jdbc.
	 */
	@Test
	public void testCreateEmptyActivitySetJDBC()
	{

		ActivitySetJDBC activitySetJDBC = new ActivitySetJDBC();

		assertNotNull(activitySetJDBC);
		assertTrue("A new activitySetJDBC should be empty", activitySetJDBC.isEmpty());
		assertEquals("A new activitySetJDBC has no element", 0, activitySetJDBC.size());
	}

	/**
	 * Test add.
	 */
	@Test
	public void testAdd()
	{

		ActivitySetJDBC activitySetJDBC = new ActivitySetJDBC();
		ActivityJDBC activityJDBC = new ActivityJDBC();

		activitySetJDBC.addActivity(activityJDBC);

		assertNotNull(activitySetJDBC);
		assertFalse("The ActivitySetJDBC must be not empty", activitySetJDBC.isEmpty());
		assertEquals("The ActivitySetJDBC contains 1 item", 1, activitySetJDBC.size());
	}

}
