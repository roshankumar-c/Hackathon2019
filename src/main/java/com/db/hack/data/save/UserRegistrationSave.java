package com.db.hack.data.save;

import com.db.hack.beans.QuizResult;
import com.db.hack.beans.UserRegistration;
import com.db.hack.databse.DatabaseConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Roshan on 6/4/2019.
 */
public class UserRegistrationSave {

    private DatabaseConnectionFactory dataBaseConnectionFactory;

    public UserRegistrationSave(DatabaseConnectionFactory daataBaseConnectionFactory) {
        this.dataBaseConnectionFactory = daataBaseConnectionFactory;
    }



    public Boolean saveQuizResult(UserRegistration userReg){
        Connection conn = dataBaseConnectionFactory.getConnection();
        if (conn!=null)
        {
            try
            {
                // the mysql insert statement
                String query = "INSERT INTO dbo.users (first_name, last_name, userid, passwd, " +
                        "role, schoool, grade, is_certified, created_date ) VALUES"
                        + " (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString (1, userReg.getFirstName());
                preparedStmt.setInt (2, Integer.parseInt(userReg.getLastName()));
                preparedStmt.setInt   (3, Integer.parseInt(userReg.getRole()));

                // execute the preparedstatement
                preparedStmt.execute();
               // Statement select = conn.createStatement();
                //select.execute("INSERT INTO dbo.test_results (user_id, quiz_id, score) VALUES("++","+quizResult.getQuizid()+","+quizResult.getTestscore()+")");
                System.out.println("saved data in database");

                /**
                 * CREATE TABLE [dbo].[users](
                 [ID] [int] IDENTITY(1,1) NOT NULL,
                 [first_name] varchar NULL,
                 [last_name] varchar NULL,
                 [userid] varchar NULL,
                 [passwd] varchar NULL,
                 [role] varchar NULL,
                 [schoool] varchar NULL,
                 [grade] varchar NULL,
                 [is_certified] varchar NULL,
                 [created_date] [datetime] NULL,
                 */
                return true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

}
