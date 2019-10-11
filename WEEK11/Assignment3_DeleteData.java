import java.sql.*;
import java.lang.*;
public class DeleteData {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              String query="";
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              String sql = "DELETE FROM PLAYERS " +
                   "WHERE UID = 1";
      stmt.executeUpdate(sql);
			}
                catch(Exception e){ System.out.println(e);}  
	}  
}  
