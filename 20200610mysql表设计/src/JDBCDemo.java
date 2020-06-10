/**
 * Created with Intellij IDEA
 *
 * @program: 20200610mysql表设计
 * @Description:
 * @USer:LD
 * @Date: 2020-06-10 22:07
 * @time: 22:07
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> cls = Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cls.getSimpleName());

    }
}
