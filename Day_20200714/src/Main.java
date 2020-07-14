import java.util.*;

/**
 * @author LD
 * @date 2020/7/14 14:03
 */
public class Main {


        public static String path = "";
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int p = in.nextInt();
            int[][] grid = new int[n][m];
            boolean[][] visited = new boolean[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    grid[i][j] = in.nextInt();
                }
            }
            Helper(grid,0,0,visited,"",p);
            System.out.println(path);
        }
        public static void Helper(int[][] grid,int i,int j, boolean[][] visited,String res,int p) {
            if(i == 0 && j == grid[0].length-1 && grid[i][j] == 1){
                if(p >=0 ){
                    path = res + "["+i+","+j+"]";
                }else{
                    path =  "Can not escape!";
                }
                return;
            }
            if(i >=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==1 && !visited[i][j]){
                visited[i][j] = true;
                res += "["+i+","+j+"],";
                Helper(grid,i,j+1,visited,res,p-1);//向右
                Helper(grid,i+1,j,visited,res,p);//向下
                Helper(grid,i,j-1,visited,res,p-1);//向左
                Helper(grid,i-1,j,visited,res,p-3);//向上
            }
        }


    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        while (n >0) {
            int i = sc.nextInt();
            int a = sc.nextInt();
            if(i == 1) {
                list.add(a);
            }else {
                list.remove(a);
            }
            boolean b = judge(list);
            if(b) {
              list1.add(1);
            }else {
                list1.add(0);
            }
            n--;
        }
        for (int j = 0; j < list1.size(); j++) {
            if(list1.get(j) == 0) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }


    private static boolean judge(List<Integer> list) {
        int len = list.size();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int maxNum = list.get(len-1);
        int sum =0;
        for(int i = 0; i < len-1; i++) {
            sum += list.get(i);
        }
        if(sum > maxNum) {
            return true;
        }else {
           return false;
        }
    }
}
