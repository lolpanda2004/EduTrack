package StudentDetails;
//import StudentDetails.DBInsert;
import java.sql.*;

public class DBDelete {
    public static int x=1;
    static Connection conn=DBConnector.connect();
    static PreparedStatement ps;
    public static void delete(String roll){
    try{
    String sql="DELETE FROM BaseDetails WHERE rollno='"+roll+"';";
    ps=conn.prepareStatement(sql);
    ps.execute();
    //conn.commit();
    System.out.println("Deleted!");
    }
    catch (SQLException e){
    x=0;
    System.out.println(e+" ");
    }
    finally {
    try{
    ps.close();
    conn.close();
    }
    catch(SQLException e){
    x=0;
    System.out.println(e+" ");
    }
    }

  }
}
