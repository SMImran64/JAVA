package midlevelquestion10;

public class EmployeeManagementSystemWithAbstractMethod {

    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee(25000, "Imran", 5001, 25000);
        PartTimeEmployee emp2 = new PartTimeEmployee(5, 300, "Faruk", 5002, 15000);

        System.out.println("\n ---FullTime Employee Details---");
        emp1.Details();

        System.out.println("\n ---Part-Time Employee Details---");
        emp2.Details();

        System.out.println("\n ---Instance Type Checks---");
        
        System.out.println("emp1 is FullTimeEmployee: " + (emp1 instanceof FullTimeEmployee));
        System.out.println("emp2 is PartTimeEmployee: " + (emp2 instanceof PartTimeEmployee));
        System.out.println("Both emp1 and emp2 are Employee: " + (emp1 instanceof Employee && emp2 instanceof Employee));
    }
}
