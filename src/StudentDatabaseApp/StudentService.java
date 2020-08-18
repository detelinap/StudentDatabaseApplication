package StudentDatabaseApp;

import java.util.Scanner;

public class StudentService {
    Scanner scan = new Scanner(System.in);
    CourseService courseService = new CourseService();

    public void viewStatus(Student student){
        System.out.print(student.getName()+ " with the ID ");
        System.out.print(student.getUniqueID()+ " in year ");
        System.out.print(student.getYear()+" has a balance of:");
        System.out.print(student.getBalance());
        System.out.print("The list of courses include");
        for ( int i = 0; i < student.getCourses().size(); i++){
            System.out.print(" "+ student.getCourses().get(i).getName()+" ");
        }
    }

    public void checkCourse(Student student){
        int choice = chooseCourse();
        if(student.getBalance()>200){
            student.getCourses().add(courseService.getClassList().get(choice));
            System.out.println("The course "+courseService.getClassList().get(choice).getName()+" has been added to your course list");
        } else {
            System.out.println("Insufficient balance to add course");
        }
    }

    public int chooseCourse() {
        int choice;
        System.out.println("Please choose a course you would like to take. Each class costs $200.");
        System.out.println("1: History 101  \n" +
                "2: Mathematics 101 \n" +
                "3: English 101 \n" +
                "4: Chemistry 101 \n" +
                "5: Computer Science 101 \n" +
                "Enter your choice below:");
        do {
            choice = scan.nextInt();
            if(choice >5 || choice <1){
                System.out.println("Invalid choice. Please try again");
            }
        } while (choice >5 || choice <1);
    return choice;
    }

    public void addBalance(Student student){
        System.out.println("Your current balance is "+ student.getBalance());

    }
}
