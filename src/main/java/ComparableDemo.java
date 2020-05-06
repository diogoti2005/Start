import java.util.ArrayList;
import java.util.Collections;
public class ComparableDemo {
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ira", 20, "Tester"));
        employees.add(new Employee("Tatiana", 18, "Tester"));
        employees.add(new Employee("Natalia", 21, "Tester"));
        Collections.sort(employees);
        System.out.println(employees);

    }

}
