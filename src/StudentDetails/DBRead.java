package StudentDetails;

import java.sql.*;


public class DBRead {
    public static String roll;
    public static String name;
    public static String dept;
    public static String phone;
    public static String addr;
    public static int c10;
    public static int c12;
    public static float gpa;
    public static int x=1;
    static Connection conn=DBConnector.connect();
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    
    public static void read(String rollno){
    try{
    String sql="SELECT * FROM BaseDetails where rollno='"+rollno+"';";
    ps=conn.prepareStatement(sql);
    rs=ps.executeQuery();
    roll=rollno;
    name=rs.getString("name");
    dept=rs.getString("dept");
    phone=rs.getString("phonenumber");
    addr=rs.getString("address");
    c10=rs.getInt("class10marks");
    c12=rs.getInt("class12marks");
    gpa=rs.getFloat("currentgpa");
    System.out.println(roll+name+dept+phone+addr+c10+c12+gpa);
    }
    catch (SQLException e){
    x=0;
    System.out.println(e+" ");
    }
    finally {
    try{
    rs.close();
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
    
