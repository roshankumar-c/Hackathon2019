package com.db.hack.databse;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
/**
 * Created by Roshan on 6/4/2019.
 */
public class DatabaseConnectionFactory {

        private Connection connection;
        private Statement statement;

        public DatabaseConnectionFactory (String username, String password ) {
            String url = "jdbc:sqlserver://team7server.database.windows.net:1433;databaseName=HackTeam7";
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Driver is set; ready to go!");
            }
            catch (Exception e) {
                System.out.println("Failed to load JDBC/ODBC driver.");
                return;
            }

            try {
                connection = DriverManager.getConnection (url, username, password );
                statement  = connection.createStatement();
            }
            catch (SQLException exception ) {
                System.out.println ("\n*** SQLException caught ***\n");
                while (exception != null)
                {                                                                     // grab the exception caught to tell us the problem.
                    System.out.println ("SQLState:   " + exception.getSQLState()  );
                    System.out.println ("Message:    " + exception.getMessage()   );
                    System.out.println ("Error code: " + exception.getErrorCode() );
                    exception = exception.getNextException ();
                    System.out.println ( "" );
                }
            }
            catch (java.lang.Exception exception) {                                  // perhaps there is an exception that was not SQL related.
                exception.printStackTrace();                                         // shows a trace of the exception error--like we see in the console.
            }
        }

}
