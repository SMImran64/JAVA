
package Daw;

import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pos.util.DatabaseUtil;


public class UserDao {

    DatabaseUtil util = new DatabaseUtil();

    PreparedStatement ps;
    String sql;
    ResultSet rs;

    public String UserVarification(String user, String pass) {

        List<User> userlist = new ArrayList<>();

        String userRole = null;

        sql = "select * from user";

        try {

            ps = util.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String designation = rs.getString("designation");

                userlist.add(new User(id, userName, password, designation));

            }

            rs.close();
            ps.close();
            util.getCon().close();

            for (User users : userlist) {

                if (user.equalsIgnoreCase(users.getName()) && pass.equals(users.getPassword())) {

                    userRole = users.getDesignation();
                    break;

                }

            }

        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Wrong username or password.");
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userRole;
    }

}
