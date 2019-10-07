/* Complete the code segment to create a new table named ‘PLAYERS’ in SQL database using the following information.
Column UID First_Name Last_Name Age
Type Integer Varchar (45) Varchar (45) Integer*/
import java.sql.*;
import java.lang.*;
public class CreateTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              String sql = "CREATE TABLE PLAYERS " +
                   "(UID INT, " +
                   " First_Name VARCHAR(45), " + 
                   " Last_Name VARCHAR(45), " + 
                   " Age INT, " + 
                   " PRIMARY KEY ( UID ))"; 

      stmt.executeUpdate(sql);
      
             }
       catch(Exception e){ System.out.println(e);}  
    }
}
/*
https://youtube.com/c/StudyFun for explanation you can see here please subscribe if you like my video
 Mail your queries on studyizfun@gmail.com
connect me on linkedin
https://www.linkedin.com/in/kamesh-shekhar-5a3467152/
If you like my video 
Please donate at least RS 10 to my paytm wallet 8809692924
It will help me financially and encourage me to make more videos
*/
