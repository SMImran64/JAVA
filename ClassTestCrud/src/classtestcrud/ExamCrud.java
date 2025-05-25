package classtestcrud;

import classtestcrud.Util.ExamUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamCrud {

    static ExamUtil cu = new ExamUtil();
    static PreparedStatement ps;
    static String sql;

    public static void main(String[] args) {
        
        saveEmployeeInfo("Masud", "Jr. Software Engineer", 50000);
        saveEmployeeInfo("Istiaque", "Jr. Software Engineer", 60000);
        System.out.println("\n Employee details Save successfully");
        System.out.println("-------------------------------------");
        showEmployeeInfo();
        System.out.println("\n -------------------------------------");
        
        
        updateEmployeeInfo("Abdullah Al Masud", "Jr. Software Engineer", 50000, 1);
        System.out.println("\n Employee details update successfully");
        System.out.println(" ---------------------------------------");
        showEmployeeInfo();
        System.out.println("\n ---------------------------------------");
        
        
        deleteEmployeeInfo(2);
        System.out.println("Selected Employee details deleted successfully");
        System.out.println("----------------------------------------------");
        showEmployeeInfo();
        System.out.println("\n ----------------------------------------------");
        

    }

    public static void saveEmployeeInfo(String name, String designation, float salary) {

        sql = "insert into employee (name,designation,salary)values(?,?,?)";

        try {
            ps = cu.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);

            ps.executeUpdate();
            ps.close();
            cu.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showEmployeeInfo() {

        sql = "select * from employee";
        try {
            ps = cu.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");

                System.out.println("\n Id No. : " + id + "\n Name : " + name + "\n Designation : " + designation + "\n Salary : " + salary);

            }

            rs.close();
            ps.close();
            cu.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmployeeInfo(String name, String designation, float salary, int id) {

        sql = "update employee set name = ?, designation = ?,salary = ? where id = ?";

        try {
            ps = cu.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            cu.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmployeeInfo(int id) {

        sql = "delete from employee where id = ?";

        try {
            ps = cu.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(ExamCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
