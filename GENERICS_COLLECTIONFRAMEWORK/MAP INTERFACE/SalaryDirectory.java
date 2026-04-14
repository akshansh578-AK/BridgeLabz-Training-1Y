import java.util.*;

public class SalaryDirectory {

    private Map<String, Double> salaries = new HashMap<>();

    // 1. Add employee
    public void addEmployee(String name, double salary) {
        salaries.put(name, salary);
    }

    // 2. Give raise
    public void giveRaise(String name, double percent) {
        if (salaries.containsKey(name)) {
            double current = salaries.get(name);
            double updated = current + (current * percent / 100);
            salaries.put(name, updated);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }

    // 3. Average salary
    public void printAverageSalary() {
        if (salaries.isEmpty()) {
            System.out.println("No employees");
            return;
        }

        double sum = 0;
        for (double salary : salaries.values()) {
            sum += salary;
        }

        double avg = sum / salaries.size();
        System.out.println("Average Salary: " + avg);
    }

    // 4. Highest paid employee(s)
    public void printHighestPaid() {

        double maxSalary = Double.MIN_VALUE;

        for (double salary : salaries.values()) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        System.out.println("Highest Paid Employee(s):");

        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    // Display all employees
    public void displayAll() {
        System.out.println("\nEmployee List:");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        SalaryDirectory company = new SalaryDirectory();

        // 1. Add employees
        company.addEmployee("Alice", 50000);
        company.addEmployee("Bob", 60000);
        company.addEmployee("Carol", 75000);
        company.addEmployee("David", 75000);
        company.addEmployee("Eve", 45000);
        company.addEmployee("Frank", 55000);

        company.displayAll();

        // 2. Give raises
        company.giveRaise("Alice", 10);   // 10% raise
        company.giveRaise("Bob", 5);
        company.giveRaise("Zara", 10);    // not found

        company.displayAll();

        // 3. Average salary
        company.printAverageSalary();

        // 4. Highest paid employees
        company.printHighestPaid();
    }
}