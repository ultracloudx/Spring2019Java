public class Manager extends Employee{
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager:" +
                "\nname = " + name +
                "\nsalary = " + salary +
                "\ndepartment = " + department;
    }
}
