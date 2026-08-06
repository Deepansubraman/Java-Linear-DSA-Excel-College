public class Prime{
    public static void main(String[] args) {
        
        String str=prime(13);
        System.out.println(str);
    }

    static String prime(int k)
    {
        if(k<2)
        {
            return "not prime";
        }
        for (int i = 2; i < k; i++) {

            if (k % i == 0)
                return "not prime";
        }

        return "prime";
    }
}
