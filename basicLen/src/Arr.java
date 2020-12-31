import java.util.Arrays;
/**
 * 数组定义方法
 * 1.数组是用来存储相同数据类型数据或对象的集合
 * 2.数组有索引，从0开始
 */
public class Arr {
    public static void main(String[] args){
        //静态定义
        int [] arr = {1,2,3,4,5};//声明，分配空间并赋值

        //动态定义
        int arr1[];//声明
        arr1 = new int[5];//分配空间
        arr1[0] = 1;//赋值

        //默认定义
        int [] arr3 = new int[]{1,2,3,4,};//声明分配空间赋值

        //arrays工具类打印
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr3));

        //普通for循环
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
        
        //foreach|增强for循环
        for(int a:arr3){
            System.out.print(a+"\t");
        }
    }
}
