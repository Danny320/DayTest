import java.math.BigInteger;
import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200706
 * @Description:
 * @USer:LD
 * @Date: 2020-07-06 15:53
 * @time: 15:53
 **/
public class Main {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            while(s.hasNext()){
                int n = s.nextInt();
                BigInteger[] bg = new BigInteger[n];
                for(int i=0; i<n; i++)
                    bg[i] = s.nextBigInteger();
                Arrays.sort(bg);
                for(int i=0; i<n; i++)
                    System.out.println(bg[i]);
            }
        }



    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++) {
                int n = str.charAt(i)-'\0';
                String n1 = Integer.toBinaryString(n);
                int count = 0;
                for (int j = 0; j < n1.length(); j++) {
                    if(n1.charAt(j) == '1') {
                        count++;
                    }
                }

                if(count%2 == 1) {
                   int len = n1.length();
                   if(len < 8) {
                       for (int k = 0; k < 8 - len; k++) {
                          n1 = "0"+n1;
                       }
                       System.out.println(n1);
                   }else {
                       System.out.println("0"+n1.substring(1));
                   }
                }else {
                    int len = n1.length();
                    if(len < 8) {
                        for (int k = 0; k < 8 - len; k++) {
                            if(k ==(7-len)) {
                                n1 = "1" +n1;
                            }else {
                                n1 = "0" + n1;
                            }
                        }
                        System.out.println(n1);
                    }else {
                        System.out.println("1"+n1.substring(1));
                    }
                }
            }

        }
    }
}
