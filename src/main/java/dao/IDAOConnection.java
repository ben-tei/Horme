package dao;

import java.sql.*;

public interface IDAOConnection extends IDAOConstants
{
	Connection openConnection() throws SQLException;

	void closeConnection();

	Connection getConnection();

	void close(PreparedStatement pstmt);

}