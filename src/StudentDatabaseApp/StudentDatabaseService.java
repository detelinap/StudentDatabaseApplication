package StudentDatabaseApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDatabaseService {
    StudentDatabase studentDatabase = new StudentDatabase();
    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public void addStudent() throws IOException {
        System.out.println("What is the name of the student?");
        String name = "";
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("What year is the student in?");
        String strYear = reader.readLine();
        int year = Integer.parseInt(strYear);

        System.out.println("What is the student's initial balance?");
        String strBalance = reader.readLine();
        int balance = Integer.parseInt(strBalance);

        Student student = new Student(name, year, balance);
    }


}

