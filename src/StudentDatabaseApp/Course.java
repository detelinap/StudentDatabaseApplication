package StudentDatabaseApp;

public class Course {
    private String name;
    private int price;

    public Course(String name, int price) {
        this.name = name;
        this.price = 200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
