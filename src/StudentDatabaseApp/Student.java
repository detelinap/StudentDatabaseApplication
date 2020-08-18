package StudentDatabaseApp;

import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private String uniqueID;
    private int balance;
    private ArrayList<Course> courses;

    public Student(String name, int year, String uniqueID, int balance) {
        this.name = name;
        this.year = year;
        this.balance = balance;
        this.uniqueID = uniqueID;
        setUniqueID(uniqueID);
        this.courses = new ArrayList<Course>();
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private void setUniqueID(String uniqueID) {
        String yearNumber = Integer.toString(year);
        String newID = yearNumber;
        for (int i = 0; i < 4; i++){
            int digit = (int) Math.random()*10;
            String digitString = Integer.toString(digit);
            newID.concat(digitString);
        }
               this.uniqueID = newID;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
