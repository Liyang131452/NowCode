import java.util.Scanner;
 
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
       int numsLine = in.nextInt();
       for(int i = 0; i < numsLine; i++){
        int firstInt = in.nextInt();
        int count = 0;
        while(firstInt != 0){
            count += in.nextInt();
            firstInt --;
        }
        System.out.println(count);
       }
    }
}