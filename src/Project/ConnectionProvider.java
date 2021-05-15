//
//package Project;
//
//import java.sql.*;
//
//
//public class ConnectionProvider {
//    public static Connection getConnection(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc://mysql://localhost:3306/project","dev","123");
//            return conn;
//        }catch(Exception e){
//            return null;
//        }
//    }
//}
