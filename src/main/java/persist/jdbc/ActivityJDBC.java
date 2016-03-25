package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;

import com.mysql.jdbc.Statement;

import bl.core.Activity;


public class ActivityJDBC extends Activity {
	
	public ActivityJDBC()
	{
		super();
	}

	/**
	 * Instantiates a new activity jdbc.
	 *
	 * @param name the name
	 * @param category the category
	 * @param descritption the description
	 */
	public ActivityJDBC(String name, String category, String description)
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		Statement St = null;

		ResultSet rsetCategory= null;


		JComboBox categoryChoice = null; // pas ici qu'il faut le faire mais dans la vue !!!


		try{
			conn = jdbcconnection.openConnection();

			St = (Statement) conn.createStatement(); 
			rsetCategory = St.executeQuery("SELECT name FROM category"); 
			while (rsetCategory.next()) 
			{ 
				//Pour affecter une valeur de base de donnees a  un Combobox  
				categoryChoice.addItem(rsetCategory.getString(name));
			} 

			pstmt = conn.prepareStatement("INSERT INTO Activity (name, description) "
					+ "VALUES (?, ?) ");

			pstmt.setString(1, name);
			pstmt.setString(2, description);

			pstmt.executeUpdate();


		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {


			jdbcconnection.closeConnection();

		}

	}

}