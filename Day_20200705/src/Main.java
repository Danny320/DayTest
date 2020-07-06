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

    public static long bag(int []weight,int n,int sum){
        long dp[]=new long[sum+1];
        dp[0]=1;
        int i,j;
        for(i=0;i<n;i++){
            for(j=sum;j>=weight[i];j--){
                dp[j]=dp[j-weight[i]]+dp[j];
            }
        }
        return dp[sum];
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=s.nextInt();
        int i,j;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(bag(arr,n,sum));
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
