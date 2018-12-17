public class Student {
    private String name;
    private int id;
    private int points;

    public Student() {
    }

    public Student(String name, int id, int points) {
        this.name = name;
        this.id = id;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void print() {
        System.out.println(getName() + "\tid: " + getId() + "\tPoints: " + getPoints());
    }
}
