import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> team;
    private double budget;

    public Manager(String name, String string, String department, double salary) {
        super(name, string, department, salary);
        team = new ArrayList<Employee>();
        budget = 0.0;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void removeEmployee(Employee employee) {
        team.remove(employee);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
