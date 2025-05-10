

package midlevelquestion5;


public class Manager extends Employee{
    
    protected String teamSize;

    public Manager() {
    }

    public Manager(String teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(String teamSize, String name, int id, long salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }
    
    
    public String allDetails(){
    
    return "\n Employee Name: "+name+"\n Employee Id: "+id+"\n Team Size: "+teamSize+"\n Salary: "+salary;
    }
    
}
