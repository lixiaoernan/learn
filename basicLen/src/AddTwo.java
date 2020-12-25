import java.util.Scanner;

/**
 * 两数求和
 */

public class AddTwo {
    public static int addTwo(int i, int j){
        return i+j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        //第一个数
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        //第二个数
        int b = sc.nextInt();
        System.out.println("结果是：" +  addTwo(a,b));
    }
}
