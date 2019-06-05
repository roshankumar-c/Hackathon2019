package com.db.hack.data.save;

import com.db.hack.beans.Question;
import com.db.hack.beans.QuizResult;
import com.db.hack.databse.DatabaseConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshan on 6/4/2019.
 */
public class QuizResultSave {

    private DatabaseConnectionFactory dataBaseConnectionFactory;

    public QuizResultSave(DatabaseConnectionFactory daataBaseConnectionFactory) {
        this.dataBaseConnectionFactory = daataBaseConnectionFactory;
    }



    public Boolean saveQuizResult(QuizResult quizResult){
        Connection conn = dataBaseConnectionFactory.getConnection();
        if (conn!=null)
        {
            try
            {
                // the mysql insert statement
                String query = "INSERT INTO dbo.test_results (user_id, quiz_id, score) VALUES"
                        + " (?, ?, ?)";

                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString (1, quizResult.getUserid());
                preparedStmt.setInt (2, Integer.parseInt(quizResult.getQuizid()));
                preparedStmt.setInt   (3, Integer.parseInt(quizResult.getTestscore()));

                // execute the preparedstatement
                preparedStmt.execute();
               // Statement select = conn.createStatement();
                //select.execute("INSERT INTO dbo.test_results (user_id, quiz_id, score) VALUES("++","+quizResult.getQuizid()+","+quizResult.getTestscore()+")");
                System.out.println("saved data in database");
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
