public class prime1 {
    public static void main(String[] args) {
        int n=7;
        int count=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
