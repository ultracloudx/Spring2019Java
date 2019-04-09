public class Executive extends Manager{

    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Executive:" +
                "\nname = " + name +
                "\nsalary = " + salary +
                "\ndepartment = " + department;
    }
}
