import java.io.FileOutputStream;
import java.io.IOException;

public class TryFileOutput {
    public static void main(String[] args) {
        try {

            // 如果路径不对，则创建失败，为默认值null
            FileOutputStream fileOutputStream = new FileOutputStream("/home/zhouab/Documents/ww");
            fileOutputStream.write("hello".getBytes());
        } catch (IOException e) {
            System.out.println("Wrong!");
        } finally {
            if (fileOutputStream == null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("This is a wrong");
                }
            }

        }
    }
}