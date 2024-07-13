package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private final String URL = "jdbc:mysql://localhost:3306/oopgroupdb";
    private final String Uname = "root";
    private final String Password = "";
    private static DatabaseConnection instance;
    private Connection con;

    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, Uname, Password);
            System.out.println("Connection Success");
        } catch (SQLException ex) {
            System.out.println("Database Connection ERROR " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver class Error " + ex.getMessage());
        }
    }

    public static DatabaseConnection getSingleInstace() {
        try {
            if (instance == null) {
                instance = new DatabaseConnection();
            } else if (instance.con.isClosed()) {
                instance = new DatabaseConnection();
            } else {
                return instance;
            }
            return instance;
        } catch (SQLException ex) {
            System.out.println("Database Connection ERROR " + ex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuery(String sqlQ) {
        try {
            Statement st = con.createStatement();
            int result=st.executeUpdate(sqlQ);
            return result>0;
        } catch (SQLException ex) {
            System.out.println("SQL Error "+ex.getMessage());
            return false;
        }
    }

}
