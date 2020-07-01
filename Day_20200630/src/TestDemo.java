import java.util.Scanner;

/**
 * Created with Intellij IDEA
 *
 * @program: Day_20200630
 * @Description:
 * @USer:LD
 * @Date: 2020-06-30 17:46
 * @time: 17:46
 **/
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        float sum = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            v += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int grade = b[i];
            if(grade >= 90) {
                sum += a[i]*4;
            }
            if(grade>=85&&grade <= 89){
                sum +=3.7*a[i];
            }
            if(grade <= 84 && grade>=82 ){
                sum +=3.3*a[i];

            }
            if(grade <= 81 && grade>=78){
                sum +=3.0*a[i];
            }
            if(grade <= 77 && grade>=75 ){
                sum +=2.7*a[i];
            }
            if(grade <= 74 && grade>=72){
                sum +=2.3*a[i];
            }
            if(grade<=71 && grade>=68 ){
                sum +=2.0*a[i];
            }
            if( grade<=67 && grade>=64){
                sum +=1.5*a[i];
            }
            if(grade<=63 && grade>=60){
                sum +=1.0*a[i];
            }
            if(grade<60){
                sum += 0;
            }
            System.out.printf("%.2f",sum/v);
        }

    }
}
