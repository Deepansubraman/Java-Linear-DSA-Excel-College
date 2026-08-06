package TheaterManagementSystem;

public class Theater {
    Show[] shows;
    Theater()
    {
        shows=new Show[2];
        shows[0]=new Show("LEO","10.00 AM",10);
        shows[1]=new Show("GOOD BAD UGLY","2.00 PM",10);
    }
    void displayShows()
    {
        System.out.println("=========Movies========");
        for(int i=0;i<shows.length;i++)
        {
            System.out.println((i+1)+" . "+shows[i].movieName+" "+shows[i].showTime);
        }
    }
}
