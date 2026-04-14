abstract class CourseType {}

class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    private T type;

    public Course(T type) {
        this.type = type;
    }
}

class CourseUtil {
    public static void handleCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getClass().getSimpleName());
        }
    }
}