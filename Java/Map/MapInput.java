import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input some char: ");

        String line = sc.nextLine();


        //new HashMap list
        //HashMap<Character , Integer> hm = new HashMap<Character , Integer>();
        
        //按照顺序进行排序
        TreeMap<Character , Integer> hm = new TreeMap<Character , Integer>();

        //for list
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = hm.get(key);
            
            if(value == null)
            {
                hm.put(key, 1);
            }else{
                value++;
                hm.put(key , value);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for(Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();
        System.out.println(result);
        sc.close();
    }
}