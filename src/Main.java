public class Main {
    public static void main(String arg[]){
        Employee one = new Employee("Bob Smith", 20000);
        Manager two = new Manager("Sue Jones", 40000, "Human Resources");
        Executive three = new Executive("Carl Turner",60000,"Operations");

        System.out.println(one+"\n");
        System.out.println(two+"\n");
        System.out.println(three);//
    }
}
