import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200606
 * @Description:
 * @USer:LD
 * @Date: 2020-06-06 23:27
 * @time: 23:27
 **/
public class TestDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i=0;i<ch.length;i++){
                if(!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}