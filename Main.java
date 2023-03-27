
public class Main {
    public static void main(String[] args) {
        // Create several Employee objects
        Employee employee1 = new Employee("Arun", "E001", "Development", 50000);
        Employee employee2 = new Employee("Chandru", "E002", "Development", 60000);
        Employee employee3 = new Employee("Deepak", "E003", "Development", 70000);
        Employee employee4 = new Employee("Vishnu", "E004", "Marketing", 80000);
        Employee employee5 = new Employee("Nishant", "E005", "Marketing", 90000);

        // Create several Manager objects
        Manager manager1 = new Manager("Hrithik", "M001", "Development", 100000);
        Manager manager2 = new Manager("Abu", "M002", "Marketing", 110000);

        // Create several Project objects
        Project project1 = new Project("Project A", "P001", "2022-01-01", "2022-06-30");
        Project project2 = new Project("Project B", "P002", "2022-04-01", "2022-12-31");

        // Create several Client objects
        Client client1 = new Client("Client X", "contact@clientx.com");
        Client client2 = new Client("Client Y", "contact@clienty.com");

        // Assign employees to projects and managers to teams
        project1.addEmployee(employee1);
        project1.addEmployee(employee2);
        project1.addEmployee(employee3);

        project2.addEmployee(employee3);
        project2.addEmployee(employee4);
        project2.addEmployee(employee5);

        manager1.addEmployee(employee1);
        manager1.addEmployee(employee2);
        manager1.addEmployee(employee3);

        manager2.addEmployee(employee4);
        manager2.addEmployee(employee5);

        // Add projects to clients
        client1.addProject(project1);
        client2.addProject(project2);

        // Calculate the total cost of all projects
        double totalCost = client1.getTotalCost() + client2.getTotalCost();

        // Display the results
        System.out.println("Total cost of all projects: $" + totalCost);
    }
}
