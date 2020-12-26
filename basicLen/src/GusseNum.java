import java.util.Scanner;

/**
 * 猜数，练习方法
 */

public class GusseNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜的数：");
        int yourgussenum = sc.nextInt();
        //调用方法
        gusseNum(yourgussenum);
    }

    public static void gusseNum(int yourgussenum){
        //定义我心里想的数
        int myheartnum = 9;
        System.out.println(yourgussenum == myheartnum ? "恭喜，猜对了！" : "对不起，猜错了！");

    }
}