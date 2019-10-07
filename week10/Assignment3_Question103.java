import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class Question103 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
          conn = DriverManager.getConnection(DB_URL);    
          conn.close();
              System.out.print(conn.isClosed());
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
