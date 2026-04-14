abstract class JobRole {}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    private T role;

    public Resume(T role) {
        this.role = role;
    }
}

class ScreeningSystem {
    public static void process(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing: " + role.getClass().getSimpleName());
        }
    }
}