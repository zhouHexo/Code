import java.io.File;

public class FileDiGui {
    public static void main(String[] args)
    {

        //创建File对象
        File  srcFile = new File("/home/zhouan/Documents/Code/Java");

        //调用方法
        getAllFilePath(srcFile);
    }

    //定义方法用于获得给定目录下所有内容
    public static void getAllFilePath(File srcFile)
    {
        //获取给定目录下所有文件和目录的数组
        File[] fileArray = srcFile.listFiles();


        //遍历File数组，得到每一个File对象
        if(fileArray != null)
        {
            for(File file : fileArray)
            {
                if(file.isDirectory())
                {
                    getAllFilePath(file);
                }else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}