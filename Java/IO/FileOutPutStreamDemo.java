import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class FileOutPutStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        
        byte[] b = {97 , 98 , 99 , 100 , 101 , 102};
        FileOutputStream fos = new FileOutputStream("/home/zhouan/Documents/Code/Java/IO/index.txt");
        
        File file = new File("/home/zhouan/Documents/Code/Java/IO/test.txt");

        FileOutputStream fos2 = new FileOutputStream(file);

        byte[] bytes = "My name is zhouAn?".getBytes();
        
        //写入方法
        fos2.write(b);
        fos2.write(103);
        //从1开始，4个字符
        fos.write(bytes , 1 , 4);

        //释放资源（切记）
        fos.close();
    }
}
