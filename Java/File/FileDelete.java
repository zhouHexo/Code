import java.io.File;

public class FileDelete {
    public static void main(String[] args) throws Exception {
        File f1 = new File("Java/File/java.txt");
        // 创建文件
        System.out.println(f1.createNewFile());

        // 获取相对路径
        System.out.println(f1.getPath());
        // 获取绝对路径
        System.out.println(f1.getAbsolutePath());

        // 删除文件
        System.out.println(f1.delete());
        System.out.println("--------------------");

        File f2 = new File("Java/File", "www/baidu/com");
        // 创建多级目录
        System.out.println(f2.mkdirs());
        // 删除目录，但只能删除多级目录最后的子目录
        System.out.println(f2.delete());
        f2 = new File("Java/File/www", "baidu");
        System.out.println(f2.delete());
        System.out.println("==================================");
        
        
        
        
        File f3 = new File("Java/File", "zhouAn");
        System.out.println(f3.mkdir());
        File f4 = new File("Java/File/zhouAn", "zhouan.txt");
        System.out.println(f4.createNewFile());

        //如果要删除的目录下有内容，则必须先删除内容，在删除目录
        System.out.println(f4.delete());
        System.out.println(f3.delete());
    }
}