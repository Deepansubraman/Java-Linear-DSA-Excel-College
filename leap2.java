public class leap2 {
    public static void main(String[] args) {
       int units=500;
       int reduced=500-100;
       if(reduced<=0)
       {
        System.out.println("price : free");
       }
       else if(reduced<200)
       {
        System.out.println("price: "+reduced*4);
       }
       else if(reduced<400)
       {
        System.out.println("price: "+reduced*8);
       }
       else{
        System.out.println("price: "+reduced*12);
       }
    }
}