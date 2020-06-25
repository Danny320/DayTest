import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200623
 * @Description:
 * @USer:LD
 * @Date: 2020-06-23 21:17
 * @time: 21:17
 **/
public class TestDemo {
    public int getValue(int[] gifts, int n) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < gifts.length; i++) {
            if(!map.containsKey(gifts[i])) {
                map.put(gifts[i],1);
            }else {
                int v = map.get(gifts[i]);
                if(v+1 > n/2) {
                    return gifts[i];
                }
                map.put(gifts[i],v+1);
            }
        }
        return 0;
    }



    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])) {
                arr[i] = true;
            }else {
                arr[i] = false;
            }
        }
        return arr;
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            String[] s = new String[2];
            for(int i = 0; i < s.length; i++) {
                s[i] = sc.next();
            }
         map.put(Integer.getInteger(s[1]),s[0]);
         list.add(Integer.getInteger(s[1]));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int v: list) {
            System.out.println(map.get(v)+v);
        }
    }
}
