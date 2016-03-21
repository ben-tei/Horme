package persist;

import java.sql.*;

import bl.User;
import core.Activity;
import core.ActivitySet;
import core.Category;

public class ActivitySetJDBC extends ActivitySet  {
	
	public ActivitySetJDBC(User user) 
	{
		
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rsetId= null;
		
		ResultSet rsetActivity= null;
		
		PreparedStatement pstmt = null;
		
		Activity activity = null;
		
		Category category;
		
		try{
			conn = jdbcconnection.openConnection();
			
			pstmt = conn.prepareStatement("SELECT idUser FROM Person WHERE login=?");

			pstmt.setString(1, user.getLogin());

			rsetId = pstmt.executeQuery();

			Statement state = conn.createStatement();
			
			rsetActivity = state.executeQuery("SELECT a.name, a.description, c.name FROM Activity a, Category c WHERE a.idCategory = c.idCategory");
		
			
			while(rsetActivity.next()){
				activity = new Activity();
				category = new Category();
				category.setName(rsetActivity.getString("c.name"));
				activity.setName(rsetActivity.getString("a.name"));
				activity.setCategory(category);
				activity.setDescription(rsetActivity.getString("a.description"));
				this.AddActivity(activity);
			}
		}
		
		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			
			jdbcconnection.closeConnection();

		}
	}
}
