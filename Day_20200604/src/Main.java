import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200604
 * @Description:
 * @USer:LD
 * @Date: 2020-06-04 23:52
 * @time: 23:52
 **/
 class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> lefts = new Stack<>();
        if(A == null || A.length() != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if(A.charAt(i) == '(') {
                lefts.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(lefts.empty()) {
                    return false;
                }
                lefts.pop();
            }else {
                return false;
            }
        }
        if(!lefts.empty()) {
            return false;
        }else {
            return true;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) <='9' &&str.charAt(i) >='0') {
                    count++;
                    if(max < count) {
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch +"")) {
                list.add(ch);
            }
        }
        for (char ch:list) {
            System.out.print(ch);
        }
    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        for( int a = 0;a <= n;a++) {
            for(int b = 0;b<= n;b++) {
                if(n == (6*a + 8*b)) {
                    int v = a+b;
                    if(min == 0) {
                        min = v;
                    }else {
                        if(v < min) {
                            min = v;
                        }
                    }
                }
            }
        }
        if(min == 0) {
            System.out.println(-1);
        }else {
            System.out.println(min);
        }
    }
}
