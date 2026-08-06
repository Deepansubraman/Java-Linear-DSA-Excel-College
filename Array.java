import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] name={"anbu","aathi","abi"};
        String n=sc.nextLine();
        for(int i=0;i<name.length;i++)
        {
            if(name[i].equals(n))
            {
                System.out.println("Name found");
                return;
            }
        }
        System.out.println("Name not found");
    }
}