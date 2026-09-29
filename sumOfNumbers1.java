public class sumOfNumbers1 {
    public static void main(String[] args) {
       int i=420;
       int original=i;
       int ans=0;
       while(i>0)
       {
        int rem=i%10;
        ans=ans*10+rem;
        i=i/10;
       }
       if(original==ans)
       {
       System.out.println("palindrome.");
       }
       else{
        System.out.println("Not an palindrome.");
       }
    }
}
