import java.util.*;
/**
 * @author LD
 * @date 2020/7/23 15:15
 */
public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while(sc.hasNext()){
            String file = sc.next();
            int lineCount = sc.nextInt();
            String fileName = file.substring(file.lastIndexOf("\\")+1,file.length());
            if(fileName.length()>16){
                fileName = fileName.substring(fileName.length()-16);

            }
            String key = fileName+" "+lineCount;
            int value =1;
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,value);
            }
        }
        int count=0;
        for(String filename:map.keySet()){
            count++;
            if(count>map.keySet().size()-8){
                System.out.println(filename+" "+map.get(filename));
            }
        }
    }



    public static int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])) {
                map.put(array[i],1);
            }else {
                int v = map.get(array[i]);
                map.put(array[i], v + 1);
            }
            if(map.get(array[i])>array.length/2) {
                return array[i];
            }
        }
        return 0;

    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,2,2,5,4,2};
        int v = MoreThanHalfNum_Solution(array);
        System.out.println(v);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int num = 0;
            int pos = 0;
            int a = 0;
            int b = 0;
            for(int i =0 ; i<n; i++) {
                num^=arr[i];
            }
            for(int i = 0; i<32; i++) {
                if(((num >> i) & 1) ==1) {
                    pos = i;
                    break;
                }
            }
            for(int i =0; i<n; i++) {
                if(((arr[i] >> pos) &1) == 1) {
                    a ^= arr[i];
                }else {
                    b ^= arr[i];
                }
            }
            if(a < b) {
                System.out.println(a+" " +b);
            }else {
                System.out.println(b+" " +a);

            }
        }
    }
}