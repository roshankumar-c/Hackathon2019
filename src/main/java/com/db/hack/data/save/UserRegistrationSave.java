package com.db.hack.data.save;

import com.db.hack.beans.Login;
import com.db.hack.beans.QuizResult;
import com.db.hack.beans.UserRegistration;
import com.db.hack.databse.DatabaseConnectionFactory;

import java.sql.*;
import java.util.Calendar;

/**
 * Created by Roshan on 6/4/2019.
 */
public class UserRegistrationSave {

    private DatabaseConnectionFactory dataBaseConnectionFactory;

    public UserRegistrationSave(DatabaseConnectionFactory daataBaseConnectionFactory) {
        this.dataBaseConnectionFactory = daataBaseConnectionFactory;
    }



    public Boolean registerUser(UserRegistration userReg){

        try(Connection conn = dataBaseConnectionFactory.getConnection())
        {
        	System.out.println(userReg.toString());
        	
            // the mysql insert statement
            String query = "INSERT INTO dbo.users (first_name, last_name, userid, passwd, " +
                    "role, schoool, grade, is_certified, created_date ) VALUES"
                    + " (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, userReg.getFirstName().trim());
            preparedStmt.setString(2, userReg.getLastName().trim());
            preparedStmt.setString (3, userReg.getUsername().trim());
            preparedStmt.setString(4, userReg.getPassword().trim());
            preparedStmt.setString(5, userReg.getCourse().trim());
            preparedStmt.setString(6, userReg.getCourse().trim());
            preparedStmt.setString(7, userReg.getGrade().trim());
            preparedStmt.setInt(8, 0);
            preparedStmt.setDate  (9, ourJavaDateObject);

        // execute the preparedstatement
            preparedStmt.execute();
            System.out.println("saved data in database");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }


}
