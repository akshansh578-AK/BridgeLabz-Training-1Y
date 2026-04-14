import java.util.*;

public class EmployeeDepartmentMap {

    private HashMap<Integer, String> empDept = new HashMap<>();

    // 1. Add employee
    public void addEmployee(int empId, String department) {
        empDept.put(empId, department);
    }

    // 2. Change department (update value)
    public void changeDepartment(int empId, String newDept) {
        if (empDept.containsKey(empId)) {
            empDept.put(empId, newDept);
        } else {
            System.out.println("Employee ID not found: " + empId);
        }
    }

    // 3. Reverse lookup (employees in a department)
    public void findEmployeesByDepartment(String department) {
        System.out.println("\nEmployees in " + department + ":");

        boolean found = false;

        for (Map.Entry<Integer, String> entry : empDept.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(department)) {
                System.out.println("Employee ID: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found in this department");
        }
    }

    // 4. Grouping logic - count employees per department
    public void printDepartmentCount() {

        HashMap<String, Integer> deptCount = new HashMap<>();

        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nEmployee Count per Department:");
        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display all employees
    public void displayAll() {
        System.out.println("\nEmployee List:");
        for (Map.Entry<Integer, String> entry : empDept.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        EmployeeDepartmentMap company = new EmployeeDepartmentMap();

        // 1. Add employees
        company.addEmployee(101, "IT");
        company.addEmployee(102, "HR");
        company.addEmployee(103, "IT");
        company.addEmployee(104, "Finance");
        company.addEmployee(105, "HR");
        company.addEmployee(106, "IT");

        company.displayAll();

        // 2. Change department
        company.changeDepartment(104, "IT");

        company.displayAll();

        // 3. Reverse lookup
        company.findEmployeesByDepartment("IT");

        // 4. Department count
        company.printDepartmentCount();
    }
}