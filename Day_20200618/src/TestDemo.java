import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200618
 * @Description:
 * @USer:LD
 * @Date: 2020-06-18 21:54
 * @time: 21:54
 **/

public class TestDemo {
    public static void func(char ch,int n) {
        for (int i = 0; i < n/2+n%2; i++) {
            if(i == 0||i ==n/2+n%2-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ch);
                }
            }else {
                for (int j = 0; j < n; j++) {
                    if(j == 0||j ==n-1) {
                        System.out.print(ch);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        char ch = strings[1].charAt(0);
        int n = Integer.parseInt(strings[0]);
        func(ch,n);
    }



    
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String s1 = scanner.next();
            String s2 = scanner.next();
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s1);
            System.out.println(n1.add(n2));
        }

    }
}
