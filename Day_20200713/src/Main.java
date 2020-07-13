import java.util.*;
/**
 * @author LD
 * @date 2020/7/13 17:01
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String str1 = str.substring(2);
            System.out.println(Integer.parseInt(str1,16));
        }
    }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int[] num = new int[26];
            char[] ch = str.toCharArray();
            for(int i = 0; i < ch.length; i++) {
                if(ch[i] >= 'A' && ch[i] <= 'Z') {
                    num[ch[i] - 'A']++;
                }
            }
            for(int i = 0; i < 26; i++) {
                System.out.println((char)('A'+i)+":"+num[i]);
            }
        }
    }
}
