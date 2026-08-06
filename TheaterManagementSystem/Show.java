package TheaterManagementSystem;

public class Show {
    String movieName;
    String showTime;
    Seat[] seats;
    public Show(String movieName, String showTime,int totalSeats) {
        this.movieName = movieName;
        this.showTime = showTime;

        seats=new Seat[totalSeats];
        for(int i=0;i<totalSeats;i++)
        {
            
            seats[i]=new Seat(i+1);
        }
    }

    void displaySeats()
    {
        System.out.println("Available Seats: ");
        for(int i=0;i<seats.length;i++)
        {
            if(!seats[i].booked)
            {
                System.out.print(seats[i].seatNo+" ");

            }
        }
        System.out.println();
    }
    boolean bookSeat(int seatNo)
    {
        if(seatNo<1 || seatNo>seats.length){
            return false;
        }
        if(seats[seatNo-1].booked){
            return false;
        }
        seats[seatNo-1].bookSeat();
        return true;
    }
    
    
}
