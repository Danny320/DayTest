import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200602
 * @Description:
 * @USer:LD
 * @Date: 2020-06-02 12:24
 * @time: 12:24
 **/
public class TestDemo {
    public static int count(int[] A, int n) {
        // write code here
        int ret = 0;
        for(int i = 0; i<n; i++) {
            for(int j = i+1;j<n;j++) {
                if(A[i] > A[j]) {
                    ret++;
                }

            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7,0};
        System.out.println(count(a, a.length));

    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ret = 0;
            while (n >= 3) {
               int m = n/3;
               n = m+n%3;
               ret += m;
            }
            if(n == 2) {
                ret +=1;
            }
            System.out.println(ret);
        }



    }
}
