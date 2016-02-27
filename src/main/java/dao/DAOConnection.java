package dao;

import java.sql.*;

public class DAOConnection implements IDAOConstants
{
	private Connection conn;

	public DAOConnection()
	{

	}

	public Connection openConnection() throws SQLException
	{
		try {

			Class.forName( DRIVER ).newInstance();

		} catch (Exception e) {

			throw new SQLException(e.getMessage());

		} 

		DriverManager.setLoginTimeout(10);

		this.conn = DriverManager.getConnection(URL, USER, PASSWORD);

		return this.conn; 
	}

	public void closeConnection()
	{
		if(this.conn != null)
		{
			try { this.conn.close(); } 

			catch (SQLException e) { ProcessSQLException(e); }
		}
	}

	public Connection getConnection()
	{
		return this.conn;
	}

	public static void ProcessSQLException(SQLException e)
	{
		while (e != null) {

			System.err.println(e.getErrorCode());

			e.printStackTrace();

			e = e.getNextException();
		}
	} 

	public void close(PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try { pstmt.close(); } 

			catch (SQLException e) { ProcessSQLException(e); }
		}
	} 

}
