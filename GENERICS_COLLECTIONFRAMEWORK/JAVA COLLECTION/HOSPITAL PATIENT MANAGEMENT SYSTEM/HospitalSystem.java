import java.util.*;

class Patient {
    String id;
    String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " | " + name;
    }

    // uniqueness based on patient id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id.equals(p.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

public class HospitalSystem {

    // Admitted patients (no duplicates)
    private Set<Patient> admitted = new HashSet<>();

    // Waiting queue
    private Queue<Patient> waitingQueue = new LinkedList<>();

    // Discharged stack
    private Stack<Patient> dischargedStack = new Stack<>();

    // Patient history
    private List<Patient> history = new ArrayList<>();

    // ---------------- ADMIT PATIENT ----------------
    public void admitPatient(Patient p) {

        if (admitted.add(p)) {
            waitingQueue.add(p);
            history.add(p);
            System.out.println("Admitted: " + p);
        } else {
            System.out.println("Duplicate admission ignored: " + p);
        }
    }

    // ---------------- TREAT PATIENT ----------------
    public void treatPatients() {

        System.out.println("\n--- TREATING PATIENTS ---");

        while (!waitingQueue.isEmpty()) {
            Patient p = waitingQueue.poll();
            System.out.println("Treated: " + p);
        }
    }

    // ---------------- DISCHARGE PATIENT ----------------
    public void dischargePatient(Patient p) {
        if (admitted.remove(p)) {
            dischargedStack.push(p);
            System.out.println("Discharged: " + p);
        }
    }

    // ---------------- RE-ADMIT PATIENT ----------------
    public void readmitPatient() {

        if (dischargedStack.isEmpty()) {
            System.out.println("No discharged patients to re-admit.");
            return;
        }

        Patient p = dischargedStack.pop();

        if (admitted.add(p)) {
            waitingQueue.add(p);
            System.out.println("Re-admitted: " + p);
        }
    }

    // ---------------- SHOW HISTORY ----------------
    public void showHistory() {
        System.out.println("\n=== PATIENT HISTORY ===");
        for (Patient p : history) {
            System.out.println(p);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();

        // Admit patients
        system.admitPatient(new Patient("P101", "Amit"));
        system.admitPatient(new Patient("P102", "Ravi"));
        system.admitPatient(new Patient("P103", "Neha"));
        system.admitPatient(new Patient("P101", "Duplicate Amit")); // duplicate

        // Treat patients
        system.treatPatients();

        // Discharge some patients
        system.dischargePatient(new Patient("P101", "Amit"));
        system.dischargePatient(new Patient("P102", "Ravi"));

        // Re-admit last discharged
        system.readmitPatient();

        // Show history
        system.showHistory();
    }
}