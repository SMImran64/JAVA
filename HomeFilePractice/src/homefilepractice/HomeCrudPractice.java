package homefilepractice;

import homeCrudUtil.CrudUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeCrudPractice {

    static CrudUtil cu = new CrudUtil();
    static PreparedStatement ps;
    static String sql;

    public static void main(String[] args) {

        saveRoomateInfo("Faruk", "faruk@gamil.com", "Mymonshingh");
        System.out.println("\n Roommates detail after Save ");
        System.out.println("------------------");
        showAllRoommateInfo();

        updateRoommateInfo("Faruque Ahmed", "faruk@gamil.com", "Dhaka", 1);
        System.out.println("\n Roommates detail after Updated ");
        System.out.println("------------------");
        showAllRoommateInfo();
        
        
        deleteRoommateInfo(1);
         System.out.println("\n Roommates detail after Deleted ");
        System.out.println("------------------");
        showAllRoommateInfo();
    }

    public static void saveRoomateInfo(String name, String email, String address) {

        sql = "insert into roommate (name,email,address)values(?,?,?)";

        try {
            ps = cu.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();
            ps.close();
            cu.getCon().close();

            System.out.println("Roommate details save successfully");

            System.out.println("----------------------");
        } catch (SQLException ex) {
            Logger.getLogger(HomeCrudPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showAllRoommateInfo() {

        sql = "select * from roommate";

        try {
            ps = cu.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");

                System.out.println("\n Id No : " + id + "\n Name : " + name + "\n Email : " + email + "\n Address : " + address);
            }
            rs.close();
            ps.close();
            cu.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(HomeCrudPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateRoommateInfo(String name, String email, String address, int id) {

        sql = "update roommate set name = ?,email = ?, address = ? where id = ?";

        try {
            ps = cu.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(HomeCrudPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteRoommateInfo(int id) {

        sql = "delete from roommate where id = ?";

        try {
            ps = cu.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            cu.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(HomeCrudPractice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
