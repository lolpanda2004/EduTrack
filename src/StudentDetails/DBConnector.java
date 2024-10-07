
package StudentDetails;
import java.sql.*;

public class DBConnector {
    
    public static String q,op1,op2,op3,op4,res;
    
    public static Connection connect(){
        Connection con=null;
    
        try{
        Class.forName("org.sqlite.JDBC");
        con=DriverManager.getConnection("jdbc:sqlite:StudDetails.db");
        //System.out.println("Conneted");
        }
        catch(ClassNotFoundException | SQLException e){
           System.out.println(e+"");
        }
    return con;
}
}


