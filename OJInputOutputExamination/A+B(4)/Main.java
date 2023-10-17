import java.util.Scanner;
 
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int firstInt;
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            if((firstInt = in.nextInt())!=0){               
                int count = 0;
                for(int i = 0;i < firstInt; i++){
                    count += in.nextInt();
                }
                System.out.println(count);
            }else{
                break;
            }
        }
    }
}