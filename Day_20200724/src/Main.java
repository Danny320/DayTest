import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author LD
 * @date 2020/7/24 16:25
 */
public class Main {


    public static void main(String[] args){
        //键盘输入
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scan.nextInt();//能力值
        }
        int k = scan.nextInt();//距离
        int d = scan.nextInt();//范围
        long[][] max = new long[k][n];
        long[][] min = new long[k][n];
        for(int i = 0; i < k; i++)
            for(int j = 0; j < n; j++){
                max[i][j] = 1;
                if(i == 0){
                    min[i][j] = nums[j];
                    max[i][j] = nums[j];
                }
            }

        for(int i = 1; i < k; i++)
            for(int j = 0; j < n; j++)
                for(int m = 1; m <= d; m++){
                    if(j - m >= 0){
                        if(nums[j] > 0){
                            min[i][j] = Math.min(min[i][j], min[i - 1][j - m] * nums[j]);
                            max[i][j] = Math.max(max[i][j], max[i - 1][j - m] * nums[j]);
                        } else{
                            min[i][j] = Math.min(min[i][j], max[i - 1][j - m] * nums[j]);
                            max[i][j] = Math.max(max[i][j], min[i - 1][j - m] * nums[j]);
                        }
                    }
                }
        long Max = 0;
        for(int i = 0; i < n; i++)
            Max = Math.max(Max, max[k - 1][i]);
        System.out.println(Max);
    }



    static class People {
        int height;
        int weight;

        public People(int weight,int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            People[] array = new People[n];
            for(int i = 0; i < n; i++) {
                int index = sc.nextInt();
                array[index-1] = new People(sc.nextInt(),sc.nextInt());
            }

            Arrays.sort(array, new Comparator<People>() {
                @Override
                public int compare(People o1, People o2) {
                    int result = Integer.compare(o1.height,o2.height);
                    if(result != 0) {
                        return result;
                    }else {
                        return Integer.compare(o1.weight,o2.weight);
                    }
                }
            });
            int[] dp = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i = 0; i< dp.length; ++i) {
                dp[i] = 1;
                for(int j = i-1; j >=0; j--) {
                    if (array[i].weight > array[j].weight
                            || (array[i].weight == array[j].weight && array[i].height == array[j].height)) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(dp[i], max);
            }
            System.out.println(max);
        }
    }
}
