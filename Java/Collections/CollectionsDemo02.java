import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo02 {
    public static void main(String[] args)
    {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("zhouAn" , 8);
        Student s2 = new Student("zhou" , 58);
        Student s3 = new Student("An" , 58);
        Student s4 = new Student("zky" ,48);
    
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Collections.sort(array , new Comparator<Student>() {
            @Override
            //按照年龄大小排序
            public int compare(Student a , Student b)
            {
                int num1 = a.getAge()-b.getAge();
                //如果年龄相同，则比较字母顺序
                int num2 = num1 == 0 ? a.getName().compareTo(b.getName()) : num1;
                return num2;
            }
        });

        for(Student s : array)
        {
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}