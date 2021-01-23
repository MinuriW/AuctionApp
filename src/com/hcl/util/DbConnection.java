package com.hcl.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbConnection {
	public Connection getConnection() throws ClassNotFoundException, SQLException;
}
