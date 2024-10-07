package StudentDetails;

import java.sql.*;


public class DBUpdate {
    static Connection conn=DBConnector.connect();
    static PreparedStatement ps=null;
    public static int x=1;
    public static void update(String roll,String name,String dept,String phone,String addr,int c10,int c12,float gpa){
    try{
    String sql="UPDATE BaseDetails set name= '"+name+"', dept= '"+dept+"', phonenumber= '"+phone+"', address= '"+addr+"', class10marks="+c10+", class12marks="+c12+", currentgpa="+gpa+" WHERE rollno='"+roll+"';";
    System.out.println(sql);
    ps=conn.prepareStatement(sql);
    
    ps.execute();
    System.out.println("Updated"+ "!");
    }
    catch (SQLException e){
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
