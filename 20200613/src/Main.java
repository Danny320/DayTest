import java.util.*;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200613
 * @Description:
 * @USer:LD
 * @Date: 2020-06-13 21:02
 * @time: 21:02
 **/

 class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < B.length; i++) {
            int tmp = 1;
            for(int j = 0; j < A.length; j++) {
                if(i != j) {
                    tmp *= A[j];
                }
            }
            B[i] = tmp;
        }
        return B;
    }
}
public class Main {
    public static void main(String[] args) {
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < tmp.length();i++){
            int v = Integer.parseInt(tmp.charAt(i)+"");
            if(!map.containsKey(v)) {
                map.put(v,1);
                list.add(v);
            }else {
                int m = map.get(v);
                map.put(v,m+1);
            }
        }
        list.sort((o1, o2) -> o1-o2);
        for (int v: list) {
            System.out.println(v+":"+map.get(v));
        }
    }
}
