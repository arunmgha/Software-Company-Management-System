import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String id;
    private String startDate;
    private String endDate;
    private List<Employee> employees;

    public Project(String name, String string, String startDate, String endDate) {
        this.name = name;
        this.id = string;
        this.startDate = startDate;
        this.endDate = endDate;
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Employee employee : employees) {
            totalCost += employee.getSalary();
        }
        return totalCost;
    }
}
