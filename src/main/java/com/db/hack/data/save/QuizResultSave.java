package com.db.hack.data.save;

import com.db.hack.beans.Question;
import com.db.hack.beans.QuizResult;
import com.db.hack.databse.DatabaseConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
                Statement select = conn.createStatement();
                select.execute("INSERT INTO dbo.test_results (user_id, quiz_id, score) VALUES("+quizResult.getUserid()+","+quizResult.getQuizid()+","+quizResult.getTestscore()+")");
                System.out.println("saved data in databse");
                return true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        return false;
    }

}
