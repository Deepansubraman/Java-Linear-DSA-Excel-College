class College {
    void department() {
        System.out.println("Welcome to Excel Engineering College");
    }
}
class CSE extends College {
    @Override
    void department() {
        System.out.println("Welcome to Computer Science Department");
    }
}
class ECE extends College {
    @Override
    void department() {
        System.out.println("Welcome to Electronics and Communication Department");
    }
}

class AI_DS extends College {
    @Override
    void department() {
        System.out.println("Welcome to AI & Data Science Department");
    }
}

public class poly {
    public static void main(String[] args) {
        College c = new CSE();
        c.department();

        College d = new ECE();
        d.department();

        College e = new AI_DS();
        e.department();
    }
}