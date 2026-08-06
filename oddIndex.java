public class oddIndex {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println("Odd index: ");
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==1)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Even Index: ");
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]+" ");
            }
        }
    }
}
