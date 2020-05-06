public class Employee implements Comparable<Employee> {
    String nume;
    int id;
    String role;
    public Employee(String nume, int id, String role) {
        this.nume = nume;
        this.id = id;
        this.role = role;
    }
    @Override
    public int compareTo(Employee e) {
        return e.id - this.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
