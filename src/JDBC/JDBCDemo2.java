package JDBC;

import java.sql.*;

public class JDBCDemo2 {

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

        // 4. execute query - DDL
        String sql = "select * from student";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks")+"\t");

        }

    }
}
