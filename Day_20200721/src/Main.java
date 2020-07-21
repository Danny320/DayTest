import java.util.*;
/**
 * @author LD
 * @date 2020/7/21 23:23
 */
public class Main {

    public static char encryption(char c) {
        if(c >= 'a' && c < 'z')
            return (char)(c + 1 - 32);
        else if(c == 'z') return 'A';
        else if(c >= 'A' && c < 'Z')
            return (char)(c + 1 + 32);
        else if(c == 'Z') return 'a';
        else if(c >= '0' && c < '9')
            return (char)(c + 1); else if(c == '9')
                return '0';
            else return c;
    }
    //字符解密过程
     public static char decryption(char c) {
        if(c > 'a' && c <= 'z')
            return (char)(c - 1 - 32);
        else if(c == 'a') return 'Z';
        else if(c > 'A' && c <= 'Z')
            return (char)(c - 1 + 32);
        else if(c == 'A')
            return 'z';
        else if(c > '0' && c <= '9')
            return (char)(c - 1);
        else if(c == '0')
            return '9';
        else
            return c;
    }
    //加密，将输入的字符串中的每个字符进行加密。
     public static String enCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < cs.length; i++){
            sb.append(encryption(cs[i]));
        }return sb.toString();
    }
    //解密
    public static String deCryption(String s) {
        char[] cs = s.toCharArray();
     StringBuffer sb = new StringBuffer();
    for(int i = 0; i < cs.length; i++){
        sb.append(decryption(cs[i]));
    }
    return sb.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){ 
            String s1 = sc.nextLine();
            //加过密的密码
            String s2 = sc.nextLine();
            //解密的密码
            System.out.println(enCryption(s1));
            System.out.println(deCryption(s2));
        }sc.close();
    }



    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(sc.hasNext()) {
           int year = sc.nextInt();
           int month = sc.nextInt();
           int day = sc.nextInt();
           int Day = outDay(year,month,day);
           System.out.println(Day);
       }
    }
    public static int outDay(int year, int month, int day) {
        int[] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year <= 0 || month <=0 || month>12 || day<=0 || day>Day[month-1]) {
            return -1;
        }
        if(year%4==0&&year%100!=0 || year%400==0) {
            Day[1] = 29;
        }
        int sum = 0;
        for(int i = 0; i < month-1; i++) {
            sum+=Day[i];
        }
        sum+=day;
        return sum;
    }

}
