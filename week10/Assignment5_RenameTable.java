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
