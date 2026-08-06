package TheaterManagementSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Theater th=new Theater();
        th.displayShows();
        System.out.println("\nSelect Show: ");
        int choice=sc.nextInt();
        if(choice<1 || choice>th.shows.length)
       {
        System.out.println("Invalid show");
        return;
       } 
       Show sel=th.shows[choice-1];
       sel.displaySeats();
       System.out.println("Enter Seat Number: ");
       int s=sc.nextInt();
       if(sel.bookSeat(s))
       {
        System.out.println("Booking Successfully");
       }
       else{
        System.out.println("seat already booked.");

       }
       sel.displaySeats();
    }
}
