import java.util.*;
public class Leap {
    public static void main(String[] args) {
       int num=123;
       int count=0;
       while(num!=0)
       {
        count++;
        num=num/10;
       }
       System.out.println(count);
    }
}  

