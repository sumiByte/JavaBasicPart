import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Text {

    public static void main(String[] args) throws IOException {


        PrintWriter printwriter = new PrintWriter("text.txt");

        printwriter.print("这都是写入的内容");
        printwriter.print(300);
        printwriter.print("IO流需要使用close关闭才能看见写入的内容");


        //传入的是对象它写入的对象地址，与对象的内容无关
        Prosion p = new Prosion(1,"a","m");
        printwriter.print(p);
        //关闭流
        printwriter.close();
    }
}
