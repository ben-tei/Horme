package persist.jdbc;

import static persist.jdbc.JDBCConstants.*;

import java.sql.*;

/**
 * The Class JDBCConnection.
 */
public class JDBCConnection
{

	/** The conn. */
	private Connection conn;

	/**
	 * Instantiates a new JDBC connection.
	 */
	public JDBCConnection()
	{

	}

	/**
	 * Open connection.
	 *
	 * @return the connection
	 * @throws SQLException the SQL exception
	 */
	public Connection openConnection() throws SQLException
	{
		try
		{

			Class.forName(DRIVER).newInstance();

		} catch (Exception e)
		{

			throw new SQLException(e.getMessage());

		}

		DriverManager.setLoginTimeout(10);

		this.conn = DriverManager.getConnection(URL, USER, PASSWORD);

		return this.conn;
	}

	/**
	 * Close connection.
	 */
	public void closeConnection()
	{
		if (this.conn != null)
		{
			try
			{
				this.conn.close();
			}

			catch (SQLException e)
			{
				ProcessSQLException(e);
			}
		}
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public Connection getConnection()
	{
		return this.conn;
	}

	/**
	 * Process sql exception.
	 *
	 * @param e the e
	 */
	public static void ProcessSQLException(SQLException e)
	{
		while (e != null)
		{

			System.err.println(e.getErrorCode());

			e.printStackTrace();

			e = e.getNextException();
		}
	}

	/**
	 * Close.
	 *
	 * @param pstmt the pstmt
	 */
	public void close(PreparedStatement pstmt)
	{
		if (pstmt != null)
		{
			try
			{
				pstmt.close();
			}

			catch (SQLException e)
			{
				ProcessSQLException(e);
			}
		}
	}

}
