package homeCrudUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudUtil {

    private Connection con = null;
    private String sql = "jdbc:mysql://localhost:3306/learndatabase64";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(sql, user, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrudUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

}
