import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Arr {
    public static void main(String[] args) {
        int [] arr = {-1,2,4,3,-5,6,3};

//        Arrays.sort(arr);
//        System.out.print(Arrays.toString(arr));


        Arr arr1 = new Arr();
        int secondMin = arr1.findSecondEle(arr);
        System.out.println(secondMin);

        int unRepEle = arr1.findUnRepEle(arr);
        System.out.println(unRepEle);

        int Unrep = arr1.findHashRepEle(arr);
        System.out.println(Unrep);

        arr1.merge(arr);

    }

    //寻找数组中第二小的元素
    public int findSecondEle(int arr[]){
        int elemin = arr[0];//最小元素
        int elesecond = arr[0];//第二小元素
        for(int i = 0;i<arr.length - 1 ;i++){
            if(arr[i] > arr[i+1]){  //小于最小元素更新两个元素
                elesecond = elemin;
                elemin = arr[i+1];
            }else if(elesecond > arr[i+1] && arr[i+1] != elemin){ //小于第二小元素更新第二小元素
                elesecond = arr[i+1];
            }
        }
        return elesecond;
    }

    //找到数组中第一个不重复出现的整数
    //1.外层循环遍历所有元素
    //2.内层循环查看元素是否存在多次
    public int findUnRepEle(int arr[]){
        //遍历数组中每一个元素
        for(int i = 0; i<arr.length;i++){
            int j;
            for(j = 0;j<arr.length;j++){ //这个元素在数组中是否存在
                if(j != i && arr[j] == arr[i]){
                    break;
                }
            }
            if(j == arr.length){
                return arr[i];
            }

        }
        return -1;
    }

    //使用散列表实现查找数组中第一个出现一次的元素
    //1.遍历数组将每个元素出现的次数记录到哈希表中
    //2.遍历哈希表第一个值为0的就是那个元素
    public int findHashRepEle(int arr[]){
        //定义一个散列表用来存储数据
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for(int i = 0;i<arr.length;i++){
            //如果在hashMap集合中存在该元素，则对应值加1
            if(hashMap.containsKey(arr[i])){
                int value = hashMap.get(arr[i]);
                hashMap.put(arr[i],value+1);
            }else{//不存在则将其加入hashMap,并设置值为0
                hashMap.put(arr[i],0);
            }
        }
        //遍历每一key键他的值为0，第一个就是第一个为0元素----这个key就是数组中的那个元素
        for(Integer key :hashMap.keySet()){
            if(hashMap.get(key).equals(0)){
                return key;
            }
        }
        return -1;
    }


    //重新排列数组中的正值和负值
    //1.新建两个数组一个存正数一个存负数
    //2.将两个数组合并
    public void merge(int nums[]){
        int nums1[] = new int[2];//定义数组一存储负数
        int nums2[] = new int[5];//定义数组二存储正数
        int nums3[] = new int[7];//定义数组三存储处理后数组
        int k = 0;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                nums1[k] = nums[i];
                k++;
            }else if(nums[i]>=0){
                nums2[j] = nums[i];
                j++;
            }
        }

        //合并两个数组
        int f = 0;
        nums3 =  Arrays.copyOf(nums1,nums1.length+nums2.length);
        for(int i = nums1.length;i<nums3.length;i++){
            nums3[i] = nums2[f];
            f++;
        }
        System.out.println(Arrays.toString(nums3));
    }
}
