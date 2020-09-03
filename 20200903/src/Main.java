import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LD
 * @date 2020/9/3 23:01
 */
public class Main {
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("bit");//将元素e放入集合中
       // collection.clear();//删除集合中的所有元素
        collection.remove("bit");//删除其中某个元素
    }


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("及时雨","松江");
        String str = map.get("国民女神");
        System.out.println(str);


    }
}