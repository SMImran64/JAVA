package advancejavacrudproject;

import Crud.Util.CrudUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJavaCrudProject {

    static CrudUtil cu = new CrudUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveEmp("Rakib", "rakib@gmail.com", 50000);
        System.out.println("After Save");
        showAllEmp();

        System.out.println("-------------------");
        UpdateEmp("Rakib", "rakibgmail.com", 80000, 1);
        System.out.println("After Updated");
        showAllEmp();

        System.out.println("-------------------");
        deleteEmp(1);
        System.out.println("After delete");
        showAllEmp();

    }

    public static void saveEmp(String name, String email, float salary) {

        sql = "insert into emp(name,email,salary)Values(?,?,?)";

        try {
            ps = cu.getcon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);

            ps.executeUpdate();

            ps.close();
            cu.getcon().close();

            System.out.println("Data Save Successfully");
            System.out.println("------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaCrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showAllEmp() {

        sql = "select * from emp";

        try {
            ps = cu.getcon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                float salary = rs.getFloat("salary");

                System.out.println("ID: " + id + "Name: " + name + "Email: " + email + "Salary: " + salary);

            }
            rs.close();
            ps.close();
            cu.getcon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaCrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int id) {

        sql = "delete from emp where id = ?";

        try {
            ps = cu.getcon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            cu.getcon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaCrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void UpdateEmp(String name, String email, float salary, int id) {

        sql = "update emp set name =?,email=?,salary=? where id=?";

        try {
            ps = cu.getcon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            cu.getcon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaCrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
