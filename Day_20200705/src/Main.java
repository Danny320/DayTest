import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200705
 * @Description:
 * @USer:LD
 * @Date: 2020-07-05 19:56
 * @time: 19:56
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int count = 0;
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

    }



    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            double num1 = fenZi(n);
            double num2 = fenMu(n);
            double result = (num1/num2)*100;
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
    public static double fenZi(int n) {
        if(n == 1) {
            return 0;
        }else if(n == 2) {
            return 1;
        }else {
            return (n-1)*(fenZi(n-1)+fenZi(n-2));
        }
    }

    public static double fenMu(int n) {
        if(n == 0||n == 1) {
            return 1;
        }
        return n*fenMu(n-1);
    }
}
