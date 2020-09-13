import java.util.*;

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


    public static void main2(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("国民女神", "高圆圆");
        map.put("国民老公", "王思聪");
        map.put("及时雨", "松江");
        String str = map.get("国民女神");
        System.out.println(str);
    }

    public static void main3(String[] args) {
        Student stu1 = new Student("张三", "100060102", 78);
        Student stu2 = new Student("李四", "100060102", 98);
        Student stu3 = new Student("王五", "100060103", 74);
        Student stu4 = new Student("小六", "100060103", 66);
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }

    public static void main4(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }


    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch+"")) {
                str.append(ch);
            }
        }
        System.out.println(str);
    }
}
