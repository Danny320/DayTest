import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200703
 * @Description:
 * @USer:LD
 * @Date: 2020-07-03 16:35
 * @time: 16:35
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(check_length(s)) {
                if(check_kinds(s)) {
                    if(check_repeat(s)) {
                        System.out.println("OK");
                    }else {
                        System.out.println("NG");
                    }
                }else {
                    System.out.println("NG");
                }
            }else {
                System.out.println("NG");
            }
        }
        sc.close();
    }
    public static boolean check_length(String s) {
        if(s.length() <= 8) {
            return false;
        }else {
            return true;
        }
    }
    public static boolean check_kinds(String s) {
        int num = 0;
        int lowerletters = 0;
        int upperletters = 0;
        int elseletters = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                num++;
                continue;
            }
            if(Character.isLowerCase(s.charAt(i))) {
                lowerletters++;
                continue;
            }
            if(Character.isUpperCase(s.charAt(i))) {
                upperletters++;
                continue;
            }
            else {
                elseletters++;
            }
        }
        if ( ( num != 0 && lowerletters != 0 && upperletters != 0 ) || ( elseletters != 0 && lowerletters != 0 && upperletters != 0 )
                || ( num != 0 && elseletters != 0 && upperletters != 0 ) || (num != 0 && lowerletters != 0 && elseletters != 0 )) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean check_repeat (String s) {
        int num = 0;
        for(int i = 3; i < s.length(); i++) {
            for(int j = 0; j < s.length()-i;j++) {
                String str = s.substring(j,j+i);
                if(s.indexOf(str) != s.lastIndexOf(str)) {
                    num++;
                }
            }
        }
        if(num == 0) {
            return true;
        }else {
            return false;
        }
    }



    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            boolean y = func(n);
            if(y) {
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
    public static boolean func(int n) {
        int m = n*n;
        String s = Integer.toString(m);
        String s1 = Integer.toString(n);
        s = s.substring(s.length()-s1.length());
        if(s.equals(s1)) {
            return true;
        }
        return false;
    }
}
