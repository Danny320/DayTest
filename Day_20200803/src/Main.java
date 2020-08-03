import java.util.*;

/**
 * @author LD
 * @date 2020/8/3 8:57
 */
 class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 0; i < input.length; i++) {
            if(i < k){
                queue.add(input[i]);
            }
            if(i >= k) {
                if(queue.peek() > input[i]) {
                    queue.poll();
                    queue.add(input[i]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int v:
                queue) {
            list.add(v);
        }

       return list;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,0};
        int k = 7;
        Solution solution = new Solution();
         ArrayList<Integer> list =  solution.GetLeastNumbers_Solution(input,k);
        for (int v:
             list) {
            System.out.print(v);
        }
    }
    public static void main1(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String str = sc.nextLine();
        int end = 0;
        int count = 0;
        int max = 0;
       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) <= '9' && str.charAt(i) >= '0') {
               count++;
               if(count > max) {
                   max = count;
                   end = i;
               }
           }else {
               count = 0;
           }
       }
        String str1 = str.substring(end-max+1,end+1);
        System.out.println(str1);
    }
}
