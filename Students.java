public class Students {
    public static void main(String[] args) {

        String[] name = {"Abu", "Ajay", "Abi", "Arun"};
        
        int[][] mark = {
                {60, 76, 98, 76, 65},
                {54, 76, 96, 85, 64},
                {96, 85, 74, 63, 91},
                {54, 87, 65, 94, 90}
        };

        System.out.println("Name\tTamil\tEnglish\tMaths\tScience\tSocial\tAvg");

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
            double total=0;
            for (int j = 0; j < mark[i].length; j++) {
                System.out.print(mark[i][j] + "\t");
                total+=mark[i][j];
            }
            System.out.println(total/5);
            System.out.println();
        }
    }
}