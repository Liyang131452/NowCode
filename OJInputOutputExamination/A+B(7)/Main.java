import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            String[] str = s.split(" ");
            int count = 0;
            for(int i = 0; i < str.length; i++){
                count += Integer.parseInt(str[i]);
            }
            System.out.println(count);
        }
    }
}