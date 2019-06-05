package com.db.hack.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.db.hack.Exception.AuthorizationException;
import com.db.hack.beans.Question;
import com.db.hack.data.login.Login;
import com.db.hack.databse.DatabaseConnectionFactory;

public class LoginService {

	private DatabaseConnectionFactory dataBaseConnectionFactory;

	public LoginService(DatabaseConnectionFactory daataBaseConnectionFactory) {
		this.dataBaseConnectionFactory = daataBaseConnectionFactory;
	}

	public Boolean authenticate(Login login) {

		Connection conn = dataBaseConnectionFactory.getConnection();
		if (conn != null) {

			try {
				Statement select = conn.createStatement();
				ResultSet result = select.executeQuery("Select userid, passwd from dbo.users ");
				String passwd = null;
				String userID = null;

				while (result.next()) {
					userID = (String) result.getString("userid");
					passwd = (String) result.getString("passwd");

					if (userID != null && userID.equals(login.getLoginID())) {

						if (passwd != null && passwd.equals(login.getPasswd())) {
							return true;
						} else {
							return false;
						}

					}
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// return questionsList;
		}
		return false;

	}

}
