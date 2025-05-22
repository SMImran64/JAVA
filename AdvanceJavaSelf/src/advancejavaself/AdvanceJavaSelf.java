package advancejavaself;

import advancejavaself.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJavaSelf {

    static DbUtil du = new DbUtil();

    static PreparedStatement ps;

    static String sql;

    public static void main(String[] args) {

        saveStudents("Masud Rana", "masud@gmail.com", "Savar");
        System.out.println("Student information after Save");
        showAllStudent();

        updateStudentInfo("Abdullah Al Masud", "masud@gmail.com", "Savar", 1);
        System.out.println("Student information after updated ");
        showAllStudent();

        deleteStudentInfo(1);
        System.out.println("Student information after delete");
        showAllStudent();

    }

    public static void saveStudents(String name, String email, String address) {

        sql = "insert into students(name,email,address)values(?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

            System.out.println("Students Details Save successfully");
            System.out.println("----------------------");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaSelf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStudent() {

        sql = "select * from students";

        try {
            ps = du.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");

                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");

                System.out.println("Id : " + id + " Name : " + name + " Email : " + email + " Address: " + address);

            }

            rs.close();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaSelf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteStudentInfo(int id) {

        sql = "delete from students where id = ? ";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaSelf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateStudentInfo(String name, String email, String address, int id) {

        sql = "update students set name=?, email=?, address=? where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaSelf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
