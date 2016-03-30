package junit;

import org.junit.After;
import org.junit.Test;

import junit.framework.TestCase;
import persist.jdbc.ActivityJDBC;
import persist.jdbc.ActivitySetJDBC;

public class ActivitySetJDBCTest extends TestCase {
	@After
	public void tearDown() {
	}


	@Test
	public void testAdd() {

		ActivitySetJDBC activitySetJDBC = new ActivitySetJDBC(null);
		ActivityJDBC activityJDBC = new ActivityJDBC();

		activitySetJDBC.addActivity(activityJDBC);

		assertFalse("The ActivitySetJDBC must be not empty", activitySetJDBC.isEmpty());
		assertEquals("The ActivitySetJDBC contains 1 item", 1, activitySetJDBC.size());
	}

}

