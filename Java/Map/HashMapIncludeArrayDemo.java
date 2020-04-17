import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayDemo
{
    public static void main(String[] args)
    {
        // ArrayList<HashMap<String , String>> array = new ArrayList<HashMap<String , String>>();

        // HashMap<String , String> hm1 = new HashMap<String , String>();
        // hm1.put("孙策" , "大乔");
        // hm1.put("周瑜" , "小乔");

        // HashMap<String , String> hm2 = new HashMap<String , String>();
        // hm1.put("郭靖" , "黄蓉");
        // hm1.put("杨过" , "小龙女");

        // HashMap<String , String> hm3 = new HashMap<String , String>();
        // hm1.put("令狐冲" , "任盈盈");
        // hm1.put("林平之" , "岳灵姗");

        // array.add(hm1);
        // array.add(hm2);
        // array.add(hm3);

        // for(HashMap<String , String> hm : array)
        // {
        //     Set<String> keySet = hm.keySet();
        //     for(String key : keySet)
        //     {
        //         String value = hm.get(key);
        //         System.out.println(key + ", " + value);
        //     }
        // }




        //套娃
        HashMap<String , ArrayList<String>> hm = new HashMap<String , ArrayList<String>>();

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("诸葛亮");
        arrayList1.add("赵云");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("孙悟空");
        arrayList2.add("白骨精");

        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("zky");
        arrayList3.add("zgl");

        hm.put("三国演义", arrayList1);
        hm.put("西游记", arrayList2);
        hm.put("英雄联盟", arrayList3);


        //得到键值对的集合
        Set<String> keySet = hm.keySet();
        for(String key : keySet)
        {
            ArrayList<String> value = hm.get(key);
            System.out.println(key);
            for(String s : value)
            {
                System.out.println("\t" + s);
            }
        }
    }
}
