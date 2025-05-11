package midlevelquestion10;

public class PartTimeEmployee extends Employee {

    private int hoursPerDay;
    private double perHourRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int hoursPerDay, double perHourRate) {
        this.hoursPerDay = hoursPerDay;
        this.perHourRate = perHourRate;
    }

    public PartTimeEmployee(int hoursPerDay, double perHourRate, String name, int emloyeeId, long basicSalary) {
        super(name, emloyeeId, basicSalary);
        this.hoursPerDay = hoursPerDay;
        this.perHourRate = perHourRate;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public double getPerHourRate() {
        return perHourRate;
    }

    public void setPerHourRate(double perHourRate) {
        this.perHourRate = perHourRate;
    }

    @Override
    double CalculateSalary() {

        return basicSalary + (hoursPerDay * perHourRate);
    }

    @Override
    public void Details() {
        super.Details();
        System.out.println("\n Work hours Per Day: " + hoursPerDay + "\n Per Hour Rate: " + perHourRate + "\n Total Salary: " + CalculateSalary());
    }
}
