import java.util.Scanner;

/**
 * @author LD
 * @date 2020/7/26 23:32
 */
public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int[] count = new int[26];
            for(int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if(ch >= 'A' && ch <= 'Z') {
                    count[ch - 'A']++;
                }
            }
            for(int i = 0; i < 26; i++) {
                System.out.printf("%c : %d%n",('A'+i),count[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            long num = 0;
            for(int i = 2; i <line.length(); i++) {
                num *= 16;

                char ch = line.charAt(i);
                int n = 0;
                if(ch >= 'A' && ch <= 'F') {
                    n = ch -'A'+10;
                }else if(ch >= 'a' && ch <= 'f') {
                    n = ch - 'a'+10;
                }else {
                    n = ch - '0';
                }
                num += n;
            }
            System.out.println(num);
        }
    }

}
