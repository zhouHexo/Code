import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
    public static void main(String[] args)  throws IOException{
        // FileOutputStream fileOutputStream = new FileOutputStream("/home/zhouan/Documents/Code/Java/IO/aaa.txt");
        
        //向文件中添加数据，为true则写入文件末尾
        FileOutputStream fileOutputStream = new FileOutputStream("/home/zhouan/Documents/Code/Java/IO/aaa.txt", true);
        
        //多次写入数据
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("Hello".getBytes());
            fileOutputStream.write("\t".getBytes());
            fileOutputStream.write("World！".getBytes());
            fileOutputStream.write("\n".getBytes());
        }

        fileOutputStream.close();
    }
}