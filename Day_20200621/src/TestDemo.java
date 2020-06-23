import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200621
 * @Description:
 * @USer:LD
 * @Date: 2020-06-21 22:52
 * @time: 22:52
 **/
public class TestDemo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();

        }
    }



    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int p = sc.nextInt();
            if(p == 0) {
              return;
            }
            int[] arr = new int[p];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int t = sc.nextInt();
            int count = 0;
            for(int c : arr) {
                if(c == t) {
                    count++;
                }
            }
            System.out.print(count);
        }
    }


    public static void main4(String[] args) {
       Scanner sc = new Scanner(System.in);
       int groups = sc.nextInt();
       while (groups-- > 0) {
           int n = sc.nextInt();
           int k = sc.nextInt();
           int[] res = new int[2*n];
           for (int i = 0; i < 2*n; i++) {
               int tmp = i+1;
               for(int j = 0; j < k; j++){
                   if(tmp <= n) {
                       tmp = 2*tmp -1;
                   }else {
                       tmp = 2 * (tmp -n);
                   }
               }
               res[tmp-1] = sc.nextInt();
           }
           if(res.length >0) {
               System.out.print(res[0]);
           }
           for (int i = 0; i < 2*n; i++) {
               System.out.print(" "+res[i]);
           }
           System.out.println();
       }
    }



    public static double GiveRatio(String str) {
        double ratio = 0;
        double count = 0;
        for(char ch : str.toCharArray()) {
            if(ch == 'G' || ch == 'C') {
                count++;
            }
        }
        ratio = count/(double) str.length();
        return ratio;
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        int usedSize = sc.nextInt();
        String maxStr = "";
        double maxRatio = 0;
        for(int i = 0; i < dna.length()-usedSize+1; i++) {
            String str = dna.substring(i,i+usedSize);
            if(GiveRatio(str) > maxRatio) {
                maxStr = str;
                maxRatio = GiveRatio(str);
            }
        }
        System.out.println(maxStr);
    }


    public static void main2(String[] args) {
        System.out.print(10 * 30);

        int a = 0;
        for (long i = 0; i < 30; i++) {
            a = (int) (a + Math.pow(2,i));
        }
        System.out.print(" " + a);
    }


    public static void main1(String[] args) {
        Integer i01 = 59;
        Integer i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.print(i01 == i02);
        System.out.print(i03 == i04);
        System.out.print(i01 == i03);
        System.out.print(i04 == i02);

    }
}
