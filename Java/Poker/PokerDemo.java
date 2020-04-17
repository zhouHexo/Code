import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args)
    {
        //创建一个牌盒
        ArrayList<String> arrayList = new ArrayList<String>();


        //分别定义花色数组和数字数组
        String[] colors = {"~", "@" , "#" , "$"};
        String[] numbers = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};


        //遍历添加进牌组里
        for(String color : colors)
        {
            for(String number:numbers)
            {
                arrayList.add(color + number);
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");


        //随机洗牌
        Collections.reverse(arrayList);
        

        //看牌，遍历集合，给三个玩家发牌
        ArrayList<String> lqxArrayList = new ArrayList<String>();
        ArrayList<String> lyArrayList = new ArrayList<String>();
        ArrayList<String> fqyArrayList = new ArrayList<String>();
        ArrayList<String> dpArrayList = new ArrayList<String>();
        
        for(int i = 0; i < arrayList.size(); i++)
        {
            String poker = arrayList.get(i);

            if(i >= arrayList.size()-3)
            {
                dpArrayList.add(poker);
            }else if(i % 3 == 0)
            {
                lqxArrayList.add(poker);
            }else if(i % 3 == 1)
            {
                lyArrayList.add(poker);
            }else if(i % 3 == 2)
            {
                fqyArrayList.add(poker);
            }
        }

        lookPoker("zhouAn", lqxArrayList);
        lookPoker("zky", lyArrayList);
        lookPoker("xdd", fqyArrayList);
        lookPoker("底牌", dpArrayList);
    }
    
    //看牌具体方法
    public static void lookPoker(String name , ArrayList<String> arrayList)
    {
        System.out.print(name + "的牌是:\t");

        for(String poket : arrayList)
        {
            System.out.print(poket + " ");
        }
        System.out.println();
    }
}