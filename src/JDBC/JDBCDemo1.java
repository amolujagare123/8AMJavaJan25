package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. create a connection
        String user = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/8ambatch";

        Connection con = DriverManager.getConnection(connectionUrl,user,password);

        //3. create a statement object
        Statement st = con.createStatement();

        // 4. execute query - DML

      //  String sql = "insert into student values(1,'Anita','IT',67)";
     //   String sql = "update student set marks=100 where rno=1";
        String sql = "delete from student where rno=9";
        st.executeUpdate(sql);

    }
}
