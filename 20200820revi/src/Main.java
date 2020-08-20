import java.util.Arrays;

/**
 * @author LD
 * @date 2020/8/20 11:56
 */
public class Main {
    //求数组的平均值
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("平均值为："+avg(arr));
    }
    public static double avg(int[] arr) {
        int sum =0;
        for(int i = 0; i< arr.length; i++) {
            sum+=arr[i];
        }
        return (double) sum/(double) arr.length;
    }


    //给定一个整形数组，实现冒泡排序（升序）
    public static void main2(String[] args) {
        int[] arr = {6,4,9,1,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        boolean flag = true;
        for(int i = 0; i < arr.length-1; i++) {
            flag = true;
            for(int j = 0; j < arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = false;
                }
            }
            if(flag == true){
                break;
            }
        }
    }


    //二分查找
    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySeach(arr,2));
    }
    public static int binarySeach(int[] arr,int n) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(n > arr[mid]) {
                left = mid+1;
            }else if(n < arr[mid]) {
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }



    //奇数放到数组后面
    public static void swap(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            if(arr[left]%2 == 0 && left <right) {
                left++;
            }
            if(arr[right]%2 != 0 &&left <right ) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
