package com.java.sql.connector;
import java.sql.*;

public class Connector {
    public boolean sqlConnector() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample",
                    "root", "redmi100");
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from educationdetails");
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("id");
                title = resultSet.getString("userID").toUpperCase();
                System.out.println("id : " + code
                        + " userID : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
            return false;
        }
        return true;
    }
}
