import java.util.Scanner;

/**
 * @author LD
 * @date 2020/8/10 21:02
 */
public class Main {


    //给定一个字符串，判断是否为ip地址
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipStr = sc.next();
        boolean isIpLegal = isIpLegal(ipStr);
        if(isIpLegal) {
            System.out.println(ipStr + "合法");
        }else {
            System.out.println(ipStr +"非法");
        }
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
        //对输入的首末字符判断，如果是“.”则是非法ip
        if(str.charAt(0) == '.' || str.charAt(str.length()-1) == '.') {
            return false;
        }

        //按‘.’进行分割字符串，判断分割出来的个数，如果不是四个，则是非法ip
        String[] arr = str.split("\\.");
        if(arr.length != 4) {
            return false;
        }

        //对分割出来的每一个字符串进行判断，如果每一个字符串不是一位字符，且以‘0’开头，则是
        //非法的IP,如：01.002.003.04
        for(int i =  0; i < arr.length; i++) {
            if(arr[i].length() > 1 && arr[i].charAt(0) == '0') {
                return false;
            }
            //对每个字符串的每个字符进行逐一判断，如果不是数字0-9，则是非法的ip
            for(int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) < '0' || arr[i].charAt(j) >'9') {
                    return false;
                }
            }
        }


        //对拆分的每一个字符串进行数字转换，并判断是否在0-255
        for(int i = 0; i<arr.length; i++) {
            int tmp = Integer.parseInt(arr[i]);
            if(i == 0) {
                if(tmp < 1 || tmp >255) {
                    return false;
                }
            }else {
                if(tmp < 0 || tmp >255) {
                    return false;
                }
            }
        }
        return true;
    }


    //进行测试用例设计：一串数字，闰年的判断
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year <= 0 || year > 9999) {
            System.out.println("请输入正确的年份");
        }
        if(year %4 == 0&&year %100 != 0 || year%400 == 0) {
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
