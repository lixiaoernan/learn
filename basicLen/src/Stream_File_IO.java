import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Stream,File,IO流相关知识学习
 */

public class Stream_File_IO {
    public static void main(String[] args) throws IOException {
//        readChar();
        readCharDoq();
    }

    /**
     * 使用bufferedreader从控制台读取数据
     */
    public static void readChar() throws IOException {
        //创建一个bufferedreader对象，使用InputstreamReader对象
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //创建一个字符类型变量接受控制台输入的对象
        char c = (char) bf.read();
        //关闭bf对象
        bf.close();
        //打印到控制台
        System.out.print(c);
    }

    /**
     * 使用bufferedreader从控制台读取数据,直到按下q退出
     */
    public static void readCharDoq() throws IOException {
        //创建一个bufferedreader对象，使用InputstreamReader对象
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //创建一个字符类型变量接受控制台输入的对象
        char c;
        System.out.println("输入字符，直到按下去，退出");
        //循环接受控制台输入的字符直到按下q
        do{
            c = (char) bf.read();
            //打印到控制台
            System.out.print(c);
        }while (!(c == 'q'));
        //关闭bf对象
        bf.close();
    }
}


