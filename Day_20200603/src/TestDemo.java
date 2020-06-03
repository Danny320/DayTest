import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200603
 * @Description:
 * @USer:LD
 * @Date: 2020-06-03 16:28
 * @time: 16:28
 **/
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();

        char ch = A.charAt(0);

    }
}

public class TestDemo {


    public static int func(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        return func(n-1) + func(n -2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (sc.hasNextLine()) {
            String str = sc.next();
            set.add(str);
        }
        System.out.println(set.size());
    }

    public static void main1(String[] args) {

     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     int i = 0;
     int j = 0;
     while (i <str.length()) {
         char ch = str.charAt(i);
         int a = Integer.parseInt(ch+"");
         if(a>=0 &&a <=9) {
             j = i;
         }

     }
    }
}
