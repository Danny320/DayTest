import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200601
 * @Description:
 * @USer:LD
 * @Date: 2020-06-01 10:31
 * @time: 10:31
 **/
class Test {
    private int data;
    int result = 0;
    public void m() {
        result += 2;
        data += 2;
        System.out.println(result + " " + data);
    }
}
class ThreadExample extends Thread {
    private Test mv;

    public ThreadExample(Test mv) {
        this.mv = mv;
    }
    public void run(){
        synchronized (mv){
            mv.m();
        }
    }
}
public class TestDemo {
    public static boolean func(String sb){
        int left = 0;
        int right = sb.length() - 1;
        while(left < right) {
            if(sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        if(str1 == null&&func(str2) == true) {
            System.out.println(1);
        }
        for (int i = 0; i < str1.length(); i++) {
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i, str2);
            if (func(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main2(String[] args) {
        Test mv = new Test();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }

    static private int i;//全局变量可以不初始化，局部变量必须初始化
    public static void main1(String[] args) {
        System.out.println(i);
        System.out.println(Math.round(11.5));//向上取整
        System.out.println(Math.round(-11.5));

    }
}
