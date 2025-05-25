package classtestcrud.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamUtil {

    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/adjava";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExamUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

}
