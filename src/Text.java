import java.io.File;
import java.io.IOException;

public class Text {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\sumis\\Desktop\\Java-IDE-lenth\\JavaFile\\FileJavaClass");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        file.mkdir();
        if (file.exists() == true){
            System.out.println("创建成功!");
        }else {
            System.out.println("创建失败");
        }

        if (file.isDirectory() == true) {
            System.out.println("该类型是文件夹");
        }else {
            System.out.println("这是一个文件");
        }

        if (file.isFile() == true){

            System.out.println("该文件是一个文件");
        }else {

            System.out.println("该文件不是一个文件");
        }

        if (file.isHidden() == true){

            System.out.println("隐藏文件夹");
        }else {
            System.out.println("非隐藏文件夹");
        }

        System.out.println("返回了这个文件夹的绝对路径地址：" + file.getAbsolutePath());


        System.out.println(file.listFiles());
    }
}
