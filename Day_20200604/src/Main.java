import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200604
 * @Description:
 * @USer:LD
 * @Date: 2020-06-04 23:52
 * @time: 23:52
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        for( int a = 0;a <= n;a++) {
            for(int b = 0;b<= n;b++) {
                if(n == (6*a + 8*b)) {
                    int v = a+b;
                    if(min == 0) {
                        min = v;
                    }else {
                        if(v < min) {
                            min = v;
                        }
                    }
                }
            }
        }
        if(min == 0) {
            System.out.println(-1);
        }else {
            System.out.println(min);
        }
    }
}
