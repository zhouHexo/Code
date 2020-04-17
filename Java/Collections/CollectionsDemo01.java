import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(8000);
        list.add(100);

        //Collections.sort(list);//按照数字大小排序
        //Collections.reverse(list);//数组颠倒过来排序
        Collections.shuffle(list);//使用默认随机源排序  
        System.out.println(list);
    }

}