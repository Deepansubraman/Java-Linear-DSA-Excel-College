class Student {
    int rollNo;
    String name;
    private String dept;
    private String section;
    int year;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    Student(int rollNo, String name, String dept, String section, int year) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Dept    : " + dept);
        System.out.println("Section : " + section);
        System.out.println("Year    : " + year);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        Student s1 = new Student(101, "Alice", "CSE", "A", 2);
        students[0] = s1;
        Student s2 = new Student(102, "Bob", "ECE", "B", 3);
        students[1] = s2;
        students[2] = new Student(103, "Charlie", "IT", "A", 1);

        students[1].setSection("C");
        students[1].setDept("AI DS");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}