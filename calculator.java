import java.util.*;
public class calculator {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String ch1=sc.next();
    char ch=ch1.charAt(0);
        int b = sc.nextInt();

        switch(ch) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid Operator");
        }

    }
}
