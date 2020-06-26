/**
 * Created with Intellij IDEA
 *
 * @program: 20200626
 * @Description:
 * @USer:LD
 * @Date: 2020-06-26 22:44
 * @time: 22:44
 **/
public class FixUnsafe {
    private static final long N = 1_0000L;
    private static long v = 0;
    static class Add extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                synchronized (Sub.class) {
                    v++;
                }
            }
        }
    }
    static class Sub extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                synchronized (Sub.class) {
                    v--;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();
        a.start();
        s.start();
        a.join();
        s.join();
        System.out.print(v);
    }

}
