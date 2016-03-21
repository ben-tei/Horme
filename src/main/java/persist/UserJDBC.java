package persist;

import java.sql.*;

import bl.User;
import exceptions.*;

public class UserJDBC extends User
{

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

	public void updateUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email)
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("UPDATE Person SET name = ?, firstname = ?, street = ?, "
					+ "zipCode = ?, city = ?, phone = ?, email = ? WHERE idPerson = ?");

			pstmt.setString(1, name);
			pstmt.setString(2, firstname);
			pstmt.setString(3, street);
			pstmt.setString(4, zipCode);
			pstmt.setString(5, city);
			pstmt.setString(6, phone);
			pstmt.setString(7, email);
			pstmt.setString(8, this.getId());

			pstmt.executeUpdate();

			this.setName(name);
			this.setFirstName(firstname);
			this.setStreet(street);
			this.setZipCode(zipCode);
			this.setCity(city);
			this.setPhone(phone);
			this.setEmail(email);
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}
	}

}