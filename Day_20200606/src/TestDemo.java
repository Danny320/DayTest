import java.util.*;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
       int[] arr = new int[100];
       int i = 0;
       while (sc.hasNextInt()) {
           String temp=sc.nextLine();
           String[] arr3=temp.split(" ");
           int[] result=new int[arr.length-1];
           i++;
       }
       int k = arr[--i];
       int[] arr2 = new int[--i];
       for(int j = 0; j < i;j++) {
           arr2[j] = arr[j];
       }
       int j = 0;
       while ( j < arr2.length){
            if(j <= k) {
                queue.offer(arr2[j]);
            }else if(queue.peek() > arr2[j]){
                queue.poll();
                queue.offer(arr2[j]);
            }
        }
       System.out.println(queue);
    }

    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = i;
            }
            System.out.println(delete(arr));
        }
    }
    public static int delete(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
     while (queue.size() != 1) {
         int count = 0;
         while (count != 2) {
             queue.offer(queue.peek());
             queue.poll();
             count++;
         }
         queue.poll();
     }
     return queue.element();
    }
    public static void main5(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            list.add(n);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            if(!map.containsKey(tmp)) {
                map.put(tmp,1);
            }else {
                int v = map.get(tmp);
                map.put(tmp,v+1);
            }
        }
        for (int v: list) {
            if(map.get(v) >= list.size()/2) {
                System.out.println(v);
                break;
            }
        }


    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        int y4 = sc.nextInt();
        float a,b1,b2,c;
        a = (y1 + y3)/2;
        c = (y4 - y2)/2;
        b1 = (y3 - y1)/2;
        b2 = (y2 +y4)/2;
        if(b1 != b2) {
            System.out.println("No");
        }else {
            System.out.print((int)a +" " +(int)b1 +" "+ (int)c);
        }




    }
    public static void main3(String[] args) {
        boolean b = true?false:true == true? false:true;
        System.out.println(b);
    }
    public static void main2(String[] args) {
        int n = 10;
        System.out.println(test(n));
    }
    public static int test(int b) {
        try{
            b += 10;
            return b;
        }catch (RuntimeException e) {
        }
        catch (Exception e2) {
        }
        finally {
            b += 10;
            return b;
        }
    }
    public static void main1(String[] args){
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