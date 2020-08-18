package StudentDatabaseApp;

import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> classList;

    public CourseService() {
        this.classList = defaultCourses();
    }

    public ArrayList<Course> getClassList() {
        return classList;
    }

    public ArrayList defaultCourses() {
        Course historyCourse = new Course("History 101", 200);
        Course englishCourse = new Course("English 101", 200);
        Course chemistryCourse = new Course("Chemistry 101", 200);
        Course mathCourse = new Course("Math 101", 200);
        Course csCourse = new Course("Computer Science 101", 200);

        classList.add(0,historyCourse); classList.add(1,mathCourse); classList.add(2,englishCourse); classList.add(3,chemistryCourse); classList.add(4,chemistryCourse);
        return classList;
    }
}

