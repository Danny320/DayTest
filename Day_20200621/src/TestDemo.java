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
        System.out.print(10 * 30);

        int a = 0;
        for (long i = 0; i < 30; i++) {
            a = (int) (a + Math.pow(2,i));
        }
        System.out.print(" " + a);
    }


    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        int n = sc.nextInt();
        sc.close();

        int max = 0;
        String result = null;
        for(int i = 0; i < input.length()-5; i++){
            //每次截取制定长度的字串进行遍历
            String temp = input.substring(i, i+n);
            int length = 0;
            for(int j = 0; j < n; j++){
                if(temp.charAt(j) == 'G' || temp.charAt(j) == 'C')
                    length++;
            }
            if(max < length){
                max = length;
                result = temp;
            }
        }
        System.out.println(result);
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
