import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200702
 * @Description:
 * @USer:LD
 * @Date: 2020-07-02 09:30
 * @time: 09:30
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(IPToTen(str1));
            TenToIp(str2);
        }
        sc.close();
    }

    public static void TenToIp(String s){
        long tmp = Long.parseLong(s);
        String ip = Long.toBinaryString(tmp);
        StringBuffer sb = new StringBuffer();
        while (ip.length() < 32)
            ip = "0" + ip;
        ip = ip.substring(ip.length() - 32);
        sb.append(ip);

        for (int i = 0; i < sb.length() - 8; i += 8)
            System.out.print(Integer.parseInt(sb.substring(i, i + 8), 2) + ".");

        System.out.println(Integer.parseInt(sb.substring(sb.length() - 8), 2));

    }
    public static Long IPToTen(String ip) {
        String[] arr = ip.split("\\.");
        long n = Long.parseLong(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            n <<= 8;
            n+= Long.parseLong(arr[i]);
        }
        return n;
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int i = 0;
        for( i = 0; i < n; i++) {
            if(arr[i] == x) {
                break;
            }
        }
        if(i == n) {
            System.out.println(-1);
        }else {
            System.out.println(i);
        }
    }


}
