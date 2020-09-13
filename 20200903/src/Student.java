/**
 * @author LD
 * @date 2020/9/12 9:35
 */
public class Student {
    public String name;
    public String Class;
    public double sorce;

    public Student(String name, String aClass, double sorce) {
        this.name = name;
        Class = aClass;
        this.sorce = sorce;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                ", sorce=" + sorce +
                '}';
    }
}
