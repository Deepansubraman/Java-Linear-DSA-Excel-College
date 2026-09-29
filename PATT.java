public class PATT {
    public static void main(String[] args) {
        pattern(2);
        pattern(3);
        pattern(4);
        pattern(5);
        pattern(6);
    }


    static void pattern(int n)
    {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}