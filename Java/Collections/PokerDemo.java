import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args)
    {

        //创建HashMap , 键是编号，值是牌
        HashMap<Integer , String> hm = new HashMap<Integer , String>();
        
        //创建ArrayList，存储编号
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    
        
        //创建花色和数字数组
        String[] colors = {"~" , "!" , "#" , "@"};
        String[] numbers = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};


        //从0开始放编号
        int index = 0;
        for(String numString : numbers)
        {
            for(String colorString : colors)
            {
                hm.put(index, colorString + numString);
                arrayList.add(index);
                index++;
            }
        }

        hm.put(index, "小王");
        arrayList.add(index);
        index++;
        hm.put(index , "大王");
        arrayList.add(index);


        //洗牌，洗的是编号
        Collections.shuffle(arrayList);
    
        //发牌，发的也是编号，为了保证编号是排序，使用TreeSet方法
        TreeSet<Integer> oneSet = new TreeSet<Integer>();
        TreeSet<Integer> twoSet = new TreeSet<Integer>();
        TreeSet<Integer> threeSet = new TreeSet<Integer>();
        TreeSet<Integer> fourSet = new TreeSet<Integer>();

        for(int i = 0;i < arrayList.size(); i++)
        {
            int x = arrayList.get(i);
            if(i >= arrayList.size()-3)
            {
                fourSet.add(x);
            }else if(i % 3 == 0)
            {
                twoSet.add(x);
            }else if(i % 3 == 1)
            {
                threeSet.add(x);
            }else if(i % 3 == 2)
            {
                oneSet.add(x);
            }
        }

        lookPoker("zhouAn", oneSet, hm);
        lookPoker("zky", twoSet, hm);
        lookPoker("xdd", threeSet, hm);
        lookPoker("底牌", fourSet, hm);
    }


    //定义的具体方法，便利TreeSet集合，查找集合对应的牌
    public static void lookPoker(String name , TreeSet<Integer> ts , HashMap<Integer,String> hm)
    {
        System.out.print(name + "的牌是： ");
        for(Integer key : ts)
        {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}