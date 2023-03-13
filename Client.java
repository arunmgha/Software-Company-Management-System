import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String contactInfo;
    private List<Project> projects;

    public Client(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        projects = new ArrayList<Project>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(Project project) {
        projects.remove(project);
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Project project : projects) {
            totalCost += project.getTotalCost();
        }
        return totalCost;
    }
}
