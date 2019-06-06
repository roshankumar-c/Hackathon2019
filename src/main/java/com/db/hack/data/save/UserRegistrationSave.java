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
            // the mysql insert statement
            String query = "INSERT INTO dbo.users (first_name, last_name, userid, passwd, " +
                    "role, schoool, grade, is_certified, created_date ) VALUES"
                    + " (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, userReg.getFirstName());
            preparedStmt.setString(2, userReg.getLastName());
            preparedStmt.setString (3, userReg.getUsername());
            preparedStmt.setString(4, userReg.getPassword());
            preparedStmt.setString(5, userReg.getCourse());
            preparedStmt.setString(6, userReg.getCourse());
            preparedStmt.setString(7, userReg.getGrade());
            preparedStmt.setString(8, "false");
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
