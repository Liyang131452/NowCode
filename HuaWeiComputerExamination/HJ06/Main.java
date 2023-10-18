import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        long num = in.nextInt();
        long nums = (long)Math.sqrt(num);
        long k = 2;
        while(k <= nums){
            if(num % k == 0){
                System.out.print(k+" ");
                num /= k;
            }else{
                k++;
            }
        }
         System.out.println(num == 1 ? "" : num);
    }
}