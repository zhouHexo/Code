import java.io.File;

public class FileDemo01 {
    public static void main(final String[] args) throws Exception
    {
        //3中构造方法
        /*         File f1 = new File("/home/zhouan/Documents/1.txt");
        System.out.println(f1);

        File f2 = new File("/home/zhouan/Documents/" , "2.txt");
        System.out.println(f2);

        File f3 = new File("/home/zhouan/Docuemnts");
        File f4 = new File(f3 , "3.txt");
        System.out.println(f4); */

        File f1 = new File("/home/zhouan/Documents/java.txt");
        //符合boolean值，如果未创建则true，创建则false
        System.out.println(f1.createNewFile());

        File f2 = new File("/home/zhouan/Documents/JavaSe");
        //创建目录，+s表示可以创建多级目录
        System.out.println(f2.mkdir());

        //如果出现同名，则都是false包括目录和文件重名
        File f3 = new File("/home/zhouan/Documents/JavaSe");
        System.out.println(f3.createNewFile());
        

    }
}