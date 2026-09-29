import java.util.HashMap;

public class anagram1 {
    public static void main(String[] args) {
        String str="silent";
        String str1="listen";

        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str1.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)-1);
            }
            if(map.get(ch)==0)
            {
                map.remove(ch);
            }
        }
        if(map.isEmpty())
        {
            System.out.println("Anagram");

        }
        else{
            System.out.println("Not an anagram");
        }
    }
}
