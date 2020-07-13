import java.util.Scanner;

/**
 * @author LD
 * @date 2020/7/8 21:12
 */
public class Main {
    public static void findMoney(String p, String a)
    {
        //两个常亮用来表示各个单位到最小单位之间的进制关系
        final int FIRST = 17*29;
        final int SECOND = 29;

        String[] ps = p.split("\\.");
        int l1 = ps.length;
        int moneyP = (l1>=1?Integer.parseInt(ps[0])*FIRST:0) +
                (l1>=2?Integer.parseInt(ps[1])*SECOND:0) +
                (l1>=3?Integer.parseInt(ps[2]):0); //5421

        String[] as = a.split("\\.");
        int l2 = as.length;
        int moneyA =  (l2>=1?Integer.parseInt(as[0])*FIRST:0) +
                (l2>=2?Integer.parseInt(as[1])*SECOND:0) +
                (l2>=3?Integer.parseInt(as[2]):0); //
        //找的钱数
        int find = moneyA - moneyP;
        if (find < 0)//如果是负数，在最前面先输出一个负号，然后把它当正数处理
        {
            find *= (-1);
            System.out.print("-");
        }
        System.out.println(find/(FIRST)+"."+(find%FIRST)/SECOND+"."+find%FIRST%SECOND);
    }
    public static void main2(String[] args) {

        Scanner s = new Scanner(System.in);
        while (s.hasNext())
        {
            String p = s.next();
            String a = s.next();
            findMoney(p, a);
        }
    }


        public static void main1 (String[]args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            String[] pay = strs[0].split("\\.");
            String[] get = strs[1].split("\\.");
            int P = Integer.parseInt(pay[0]) * 17 * 29 + Integer.parseInt(pay[1]) * 29 + Integer.parseInt(pay[2]);
            int A = Integer.parseInt(get[0]) * 17 * 29 + Integer.parseInt(get[1]) * 29 + Integer.parseInt(get[2]);
            int[] arr = new int[3];
            if (P == A) {
                System.out.println("0.0.0");
                return;
            }
            int val;
            if (A > P) {
                val = A - P;
            } else {
                val = P - A;
            }
            int i = 0;
            while (val != 0) {
                if (i == 0) {
                    arr[0] = val / 493;
                    val = val % 493;
                }
                if (i == 1) {
                    arr[1] = val / 29;
                    val = val % 29;
                }
                if (i == 2) {
                    arr[2] = val;
                    val = 0; }
                i++;
            }
            if (A > P) {
                System.out.println(arr[0] + "." + arr[1] + "." + arr[2]);
            } else {
                System.out.println("-" + arr[0] + "." + arr[1] + "." + arr[2]);
            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countNumberOf2s(n));
    }
    public static int countNumberOf2s(int n) {
        int count = 0; // 最终 2 的个数
        int factor = 1; // 从低位到高位计算 2 的个数
        int low = 0; // 屏蔽掉低位
        int current = 0; // 当前计算位数的值
        int high = 0; // 计算高位
        while(n / factor != 0) {
            low = n - (n / factor) * factor;
            current = (n / factor) % 10;
            high = n / (factor * 10);
            // 根据当前的
            switch(current){
                case 0:
                case 1:
                    count += high * factor;
                    break;
                case 2:
                    count += high * factor + low + 1;
                    break;
                default:
                    count += (high + 1) * factor;
                    break;
            }
            factor *= 10;
        }
        return count;
    }
}


