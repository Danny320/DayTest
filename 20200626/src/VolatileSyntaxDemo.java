/**
 * Created with Intellij IDEA
 *
 * @program: 20200626
 * @Description:
 * @USer:LD
 * @Date: 2020-06-26 23:09
 * @time: 23:09
 **/
public class VolatileSyntaxDemo {
    /**
     * 1.volatile 修饰变量的定义
     *   volatile 修饰的是共享的变量（属性和静态属性的定义）
     * 2.作用：
     * 原子性，内存可见性，代码重排序
     */
    volatile int a;
    static volatile  int b;
}
