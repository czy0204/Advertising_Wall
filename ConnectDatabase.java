package ch4.data; 
import java.sql.*;
import java.io.*;
public class ConnectDatabase{
   public static String uri="";
   static {
     try{   
            File fRead = new File("ip/IP.txt");
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead =new BufferedReader(in);
            uri=bufferRead.readLine();
            System.out.println(uri);
      }
      catch(IOException exp){
          System.out.println("不要删除IP文件"+exp);
      }
   }
   Connection con;
   public final void connectDatabase() {
      try{  Class.forName("com.mysql.jdbc.Driver");
      }
      catch(Exception e){}
      try{  
         con = DriverManager.getConnection(uri);
      }
      catch(SQLException e){}
   }
}