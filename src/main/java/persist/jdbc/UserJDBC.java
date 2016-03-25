package persist.jdbc;

import java.sql.*;

import bl.core.User;
import exceptions.*;

/**
 * The Class UserJDBC.
 */
public class UserJDBC extends User
{

	/**
	 * Instantiates a new user jdbc.
	 *
	 * @param login the login
	 * @throws WrongLoginException the wrong login exception
	 */
	public UserJDBC(String login) throws WrongLoginException
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Person WHERE login=?");

			pstmt.setString(1, login);

			rset = pstmt.executeQuery();

			if (rset.next())
			{
				this.setId(rset.getString("idPerson"));
				this.setName(rset.getString("name"));
				this.setFirstName(rset.getString("firstname"));
				this.setStreet(rset.getString("street"));
				this.setZipCode(rset.getString("zipCode"));
				this.setCity(rset.getString("city"));
				this.setPhone(rset.getString("phone"));
				this.setEmail(rset.getString("email"));
				this.setLogin(rset.getString("login"));
				this.setPassword(rset.getString("password"));
			}
			else
			{
				throw new WrongLoginException("Wrong login !");
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}
	}

	/**
	 * Instantiates a new user jdbc.
	 *
	 * @param name the name
	 * @param firstname the firstname
	 * @param street the street
	 * @param zipCode the zip code
	 * @param city the city
	 * @param phone the phone
	 * @param email the email
	 * @param login the login
	 * @param password the password
	 * @throws AlreadyExistsException the already exists exception
	 */
	public UserJDBC(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt2 = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Person WHERE login=?");

			pstmt.setString(1, login);

			rset = pstmt.executeQuery();

			if (!rset.next())
			{
				pstmt2 = conn.prepareStatement("INSERT INTO Person (name, firstname, street, zipCode, city, phone, email, login, password) "
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

				pstmt2.setString(1, name);
				pstmt2.setString(2, firstname);
				pstmt2.setString(3, street);
				pstmt2.setString(4, zipCode);
				pstmt2.setString(5, city);
				pstmt2.setString(6, phone);
				pstmt2.setString(7, email);
				pstmt2.setString(8, login);
				pstmt2.setString(9, password);

				pstmt2.executeUpdate();
			}
			else
			{
				throw new AlreadyExistsException("Login already exists !");
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.close(pstmt2);

			jdbcconnection.closeConnection();

		}
	}

	/**
	 * Update user.
	 *
	 * @param name the name
	 * @param firstname the firstname
	 * @param street the street
	 * @param zipCode the zip code
	 * @param city the city
	 * @param phone the phone
	 * @param email the email
	 */
	public void save()
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("UPDATE Person SET name = ?, firstname = ?, street = ?, "
					+ "zipCode = ?, city = ?, phone = ?, email = ? WHERE idPerson = ?");

			pstmt.setString(1, this.getName());
			pstmt.setString(2, this.getFirstName());
			pstmt.setString(3, this.getStreet());
			pstmt.setString(4, this.getZipCode());
			pstmt.setString(5, this.getCity());
			pstmt.setString(6, this.getPhone());
			pstmt.setString(7, this.getEmail());
			pstmt.setString(8, this.getId());

			pstmt.executeUpdate();
			
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}
	}

}