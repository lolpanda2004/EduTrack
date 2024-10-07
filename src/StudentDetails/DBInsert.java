
package StudentDetails;
//import StudentDetails.DBConnector;
import java.sql.*;

public class DBInsert {
    public static int x=1;
    static Connection conn=DBConnector.connect();
    static PreparedStatement ps=null;
    public static void insert(String roll,String name,String dept,String phone,String addr,int c10,int c12,float gpa){
        try{
        String sql="INSERT INTO BaseDetails VALUES('"+roll+"' ,'"+name+"','"+dept+"','"+phone+"','"+addr+"',"+c10+","+c12+","+gpa+");";
        System.out.println(sql);
        ps=conn.prepareStatement(sql);
        ps.execute();
        System.out.println("Inserted!");
        
        }
        catch(SQLException e){
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
