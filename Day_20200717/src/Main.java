import java.util.Scanner;

/**
 * @author LD
 * @date 2020/7/17 15:15
 */
public class Main {

    public int[] arrayPrint(int[][] arr,int n) {
        int[] res = new int[n*n];
        int index = 0;
        int startX = 0;
        int startY = n-1;
        while(startX < n){
            int x = startX;
            int y = startY;
        while(x<n&&y<n)
            res[index++]=arr[x++][y++];
        if(startY>0)
            startY--;//确定新的开始纵坐标
            else
                startX++;//确定新的开始横坐标
            }
            return res;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str == null) {
            System.out.println("YES");
            return;
        }
        if(str.length() > 10) {
            return;
        }
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            char[] ch1 = new char[ch.length-1];
            int k =0;
            for(int j = 0; j < ch.length; j++){
                if(j != i) {
                    ch1[k] = ch[j];
                    k++;
                }

            }
            if(isHuiWen(ch1)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    private static boolean isHuiWen(char[] ch) {
        int right = ch.length-1;
        int left = 0;
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
