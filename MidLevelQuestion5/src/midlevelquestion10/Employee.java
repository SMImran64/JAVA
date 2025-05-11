
package midlevelquestion10;

public abstract class Employee {
    
    protected String name;
    protected int emloyeeId;
    protected long basicSalary;

    public Employee() {
    }

    public Employee(String name, int emloyeeId, long basicSalary) {
        this.name = name;
        this.emloyeeId = emloyeeId;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmloyeeId() {
        return emloyeeId;
    }

    public void setEmloyeeId(int emloyeeId) {
        this.emloyeeId = emloyeeId;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public void Details(){
    
        System.out.println("\n Employee Name :"+name+"\n Employee Id: "+emloyeeId+"\n Basic Salary: "+basicSalary);
    
    }
    abstract double CalculateSalary();
}
