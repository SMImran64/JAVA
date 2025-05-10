
package midlevelquestion5;

public class MidLevelQuestion5 {

    
    public static void main(String[] args) {
        
        Manager m = new Manager();
        
        
        m.setId(1005);
        m.setName("Masud Rana");
        m.setSalary(250000);
        m.setTeamSize("10");
        
        System.out.println(m.allDetails());
    }
    
}
