public class vowCon{
    public static void main(String[] args) {
        int vow=0;
        int con=0;
        String str="apple";
        for(int i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
           {
            vow=vow+1;
           }
           else{
            con=con+1;
           }
        }
        System.out.println("Vowel: "+vow);
        System.out.println("Consonents: "+con);
    }
}