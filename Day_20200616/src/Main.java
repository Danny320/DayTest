import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200616
 * @Description:
 * @USer:LD
 * @Date: 2020-06-16 16:47
 * @time: 16:47
 **/


import java.util.Scanner;

/**
 * Created by Halley on 2017/8/11.
 */
 class Main1 {
    public static final long LIMIT = 300000;//最多搜索次数
    public static final long N = 1000000007;//求余

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sol(sc.nextLong()));
        }
    }

    //次数判定方法
    public static long sol(long in){
        //如果初始位置为0，则直接可行，返回0次
        if(in == 0){
            return 0L ;
        }else{//初始位置不为0，则开始搜索
            return search(in);
        }
    }

    //不为0时的搜索
    public static long search(long in){//参数：初始坐标
        long temp = in;
        //遍历，获取最小位移
        for(int i=1;i<=LIMIT;i++){
            //long temp = (in+1)*(long)Math.pow(2,i)-1;//当循环较大时，幂次太高，数字超出范围，报错
            //递推
            temp = (temp * 2 + 1 ) % N;
            if( temp % N == 0 ){
                //i是符合条件的最小偏移，然后对其进行分解
                for(int j =0;j<=(i / 2);j++){//j对应a值
                    if((i - 2*j) % 3 == 0){
                        return ((i+j)/3);
                    }
                }
            }
        }
        //超过最大次数还没匹配，则输出-1
        return -1L;
    }
}
//不适用‘+’和其他算数运算符计算两数之和
class UnusualAdd {
    public int addAB(int A, int B) {
        int n = A^B;
        int m = (A&B)<<1;
        int sum = n+m;
        return sum;
    }
}
public class Main{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= 100000; i++) {
            if(x % 10000_00007 == 0) {
                System.out.println(count);
                break;
            }


        }

    }


    static boolean out(char c) {
        System.out.println(c);
        return true;
    }
    public static void main1(String[] args) {
        int i = 0;
        for (out('A');out('B') && (i<2);out('c') ){
            i++;
        out('D');
    }
    }
}
