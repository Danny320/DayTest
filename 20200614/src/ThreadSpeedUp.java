/**
 * Created with Intellij IDEA
 *
 * @program: 20200614
 * @Description:
 * 演示并发可以提升速度
 * 演示多线程可以提升速度
 * 计算从1+N的一个耗时
 * @USer:LD
 * @Date: 2020-06-14 17:53
 * @time: 17:53
 **/
public class ThreadSpeedUp {
    private  static final long N = 100_0000_0000L;
    private static  void 串行方式计算() {
        long b = System.currentTimeMillis();
        long r = 0;
        for(long i = 0; i < N; i++) {
            r += i;
        }
        System.out.println(r);
        long e = System.currentTimeMillis();
        System.out.printf("串行模式下，耗时：%.2f秒%n",(e - b)/1000.0);
    }

    public static void main(String[] args) {
        串行方式计算();
    }
}
