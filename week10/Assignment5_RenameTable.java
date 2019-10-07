//Complete the code segment to rename an already created table named ‘PLAYERS’ into ‘SPORTS’.
import java.sql.*;
import java.lang.*;
public class RenameTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              String str="alter table PLAYERS rename to SPORTS";
stmt.executeUpdate(str);

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
