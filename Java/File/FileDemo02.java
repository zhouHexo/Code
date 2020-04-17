import java.io.File;

public class FileDemo02 {
    public static void main(String[] args)
    {
        File f = new File("/home/zhouan/Documents/Code/Java/File/java.txt");

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        //是否存在
        System.out.println(f.exists());

        //绝对路径
        System.out.println(f.getAbsolutePath());
        //相对路径
        System.out.println(f.getPath());
        
        //文件或者目录名称
        System.out.println(f.getName());
        System.out.println("=============================================");
    
        File f2 = new File("/home/zhouan/Documents/Code/");
        //数组形式获取.相对路径
        String[] strings = f2.list();
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("=============================================");

        //返回绝对路径
        File[] files = f2.listFiles();
        for (File file : files) {
            //System.out.println(file);
            //System.out.println(file);
            
            //判断是不是文件
            if(file.isFile())
            {
                System.out.println(file.getName());
            }
        }
    }
}