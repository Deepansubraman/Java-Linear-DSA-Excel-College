public class palin{
    public static void main(String[] args) {
        int num=1221;
        int original=num;
        int ans=0;
        while(num!=0)
        {
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        if(original==ans)
        {
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}