

package midlevelquestion5;



public class Employee {
    
    protected String name;
    protected int id;
    protected long salary;

    public Employee() {
    }

    public Employee(String name, int id, long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    
    
}
