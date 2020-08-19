package StudentDatabaseApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class CourseService {

    private ArrayList<Course> classList;

    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));


    public CourseService() {
        this.classList = defaultCourses();
    }

    public ArrayList<Course> getClassList() {
        return classList;
    }

    public ArrayList defaultCourses() {
        Course historyCourse = new Course("History 101", -200);
        Course englishCourse = new Course("English 101", -200);
        Course chemistryCourse = new Course("Chemistry 101", -200);
        Course mathCourse = new Course("Math 101", -200);
        Course csCourse = new Course("Computer Science 101", 200);

        classList.add(0,historyCourse); classList.add(1,mathCourse); classList.add(2,englishCourse); classList.add(3,chemistryCourse); classList.add(4,chemistryCourse);
        return classList;
    }

    public void printCourses(){
        for (Course course : classList){
            System.out.println("Course name is "+course.getName()+" Price:"+course.getPrice());
        }
    }

    public void changeCourseName(Course course, String name){
        course.setName(name);
    }

    public void changeCourseName(Course course){
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        course.setName(name);
    }

    public void changeCoursePrice(Course course, int price){
        course.setPrice(price);
    }

    public void changeCoursePrice(Course course){
        String price = "";
        try {
            price = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Integer priceInt = Integer.parseInt(price);
    }
}

