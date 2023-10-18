import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = in.next();
        }
        Arrays.sort(str);
        for(int i = 0; i < n; i++){
            System.out.println(str[i]);
        }
    }
}