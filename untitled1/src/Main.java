import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 * @author LD
 * @date 2020/8/5 22:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String have = sc.nextLine();
        String need = sc.nextLine();
        Map<Character,Integer> h = new HashMap<>();
        for(char c : have.toCharArray()) {
            if(h.containsKey(c)) {
                h.put(c,h.get(c)+1);
            }else {
                h.put(c,1);
            }
        }
        Map<Character,Integer> n = new HashMap<>();
        for(char c : need.toCharArray()) {
            if(n.containsKey(c)) {
                n.put(c,n.get(c)+1);
            }else {
                n.put(c,1);
            }
        }
        boolean weatherBy = true;
        int lack = 0;
        for (Map.Entry<Character, Integer> en : n.entrySet()) {
            char k = en.getKey();
            int v = en.getValue();
            if (h.containsKey(k) && h.get(k) < v) {
                weatherBy = false;
                lack += v - h.get(k);
            } else if (!h.containsKey(k)) {
                weatherBy = false;
                lack += v;
            }
        }
        if (weatherBy) {
            System.out.println("Yes " + " "+(have.length()-need.length()));
        }else {
            System.out.println("No" +" "+lack);
        }
    }
}
