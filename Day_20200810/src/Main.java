import java.util.Scanner;

/**
 * @author LD
 * @date 2020/8/10 21:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipStr = sc.next();
        boolean isIpLegal = isIpLegal(ipStr);
    }
    public static boolean isIpLegal(String str) {
        //检查ip是否为空
        if(str == null) {
            return false;
        }

        //检查ip长度，最短为：x.x.x.x（7位），最长为:xxx.xxx.xxx.xxx(15位)
        if(str.length() < 7|| str.length() > 15) {
            return false;
        }
        //对输入的首末字符判断，
    }
}
