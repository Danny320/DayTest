import java.util.Random;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200615
 * @Description:
 * @USer:LD
 * @Date: 2020-06-15 23:14
 * @time: 23:14
 **/
public class ThreadDemo {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                //打印线程名称
                System.out.println(Thread.currentThread().getName());
                try {
                    //随机停止运行 0- 9秒
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        Scanner sc = new Scanner(System.in);
        t1.start();
        t2.start();
        int a = sc.nextInt();
        t3.start();

    }

}
