
package midlevelquestion10;


public class FullTimeEmployee extends Employee{
    
    private double bonus;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double bonus) {
        this.bonus = bonus;
    }

    public FullTimeEmployee(double bonus, String name, int emloyeeId, long basicSalary) {
        super(name, emloyeeId, basicSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    

    @Override
    double CalculateSalary() {
        
        return basicSalary+bonus;
    }

    @Override
    public void Details() {
        super.Details(); 
        System.out.println("\n Bonus Salary: "+bonus+"\nTotal Salary: "+CalculateSalary());
    }
    
}
