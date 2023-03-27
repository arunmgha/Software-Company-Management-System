# Software-Company-Management-System


Client.java:
This class represents a client of the software company. It has the following

 Data members:
- clientId: an int to uniquely identify the client.
- clientName: a String to store the name of the client.
- clientAddress: a String to store the address of the client.
-clientPhone: a String to store the phone number of the client.

//Constructor for Client class 

It has a constructor to initialize these data members, as well as getters and setters to access and modify them. It also has a toString() method to return a String representation of the client object.

Employee.java:

This class represents an employee of the software company. It is an abstract class, which means that it cannot be instantiated directly, but can only be used as a base class for other classes. It has the following 

Data members:
-employeeId: an int to uniquely identify the employee.
-employeeName: a String to store the name of the employee.
-employeeAddress: a String to store the address of the employee.
-employeePhone: a String to store the phone number of the employee.
-employeeSalary: a double to store the salary of the employee.

//Constructor for Employee class

It has a constructor to initialize these data members, as well as getters and setters to access and modify them. It also has an abstract method named getSalary(), which must be implemented in any subclass of Employee. This method calculates and returns the salary of the employee based on their specific role in the company.

Manager.java:

This class represents a manager of the software company. It extends the Employee class, which means that it inherits all the data members and methods of Employee, and can also add its own data members and methods. In this case, Manager has one additional 

Data member:
-department: a String to store the department of the manager.

// Constructor for Manager class

It has a constructor to initialize these data members, as well as getters and setters to access and modify them. It also has a toString() method to return a String representation of the manager object.


Project.java:

This class represents a project undertaken by the software company. It has the following

Data members:
-projectId: an int to uniquely identify the project.
-projectName: a String to store the name of the project.
-client: a Client object to store the client of the project.
-manager: a Manager object to store the manager of the project
-employees: a List of Employee objects to store the employees working on the project.

//Constructor for Project class

It has a constructor to initialize these data members, as well as getters and setters to access and modify them. It also has methods to add an employee to the project and to return a String representation of the project object.

Main.java:

The Main class contains the main method that creates and manipulates objects of the Employee, Manager, Project, and Client classes to simulate a software company management system.

In the main method, several objects are created for each of the classes. Five Employee objects, two Manager objects, two Project objects, and two Client objects are created.

The employees and managers are assigned to projects and teams, respectively. The projects are added to clients. Finally, the total cost of all projects is calculated using the getTotalCost() method of the Client class and displayed to the console.





        
    