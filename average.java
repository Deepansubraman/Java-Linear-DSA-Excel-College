class Student {
    int rollNo;
    String name;
    String dept;
    String section;
    int year;

    Student(int rollNo, String name, String dept, String section, int year) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }
}

class Marks {
    private int tamil, english, maths, science, social;

    Marks(int tamil, int english, int maths, int science, int social) {
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social = social;
    }

    // Getters
    public int getTamil() {
        return tamil;
    }

    public int getEnglish() {
        return english;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    public int getSocial() {
        return social;
    }

    // Setters
    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int total() {
        return tamil + english + maths + science + social;
    }

    public double average() {
        return total() / 5.0;
    }
}

public class average {
    public static void main(String[] args) {

        Student[] students = new Student[2];
        Marks[] marks = new Marks[2];

        students[0] = new Student(101, "Arun", "CSE", "A", 2);
        marks[0] = new Marks(85, 90, 95, 88, 92);

        students[1] = new Student(102, "Priya", "ECE", "B", 3);
        marks[1] = new Marks(78, 82, 80, 85, 90);

        // Update marks using setters
        marks[0].setMaths(100);
        marks[1].setEnglish(85);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Roll No : " + students[i].rollNo);
            System.out.println("Name    : " + students[i].name);
            System.out.println("Dept    : " + students[i].dept);
            System.out.println("Section : " + students[i].section);
            System.out.println("Year    : " + students[i].year);

            System.out.println("Tamil   : " + marks[i].getTamil());
            System.out.println("English : " + marks[i].getEnglish());
            System.out.println("Maths   : " + marks[i].getMaths());
            System.out.println("Science : " + marks[i].getScience());
            System.out.println("Social  : " + marks[i].getSocial());

            System.out.println("Total   : " + marks[i].total());
            System.out.println("Average : " + marks[i].average());

            System.out.println();
        }
    }
}