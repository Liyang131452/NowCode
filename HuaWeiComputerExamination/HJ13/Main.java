import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine();
        String[] str1 = str.split(" ");
        for(int i = str1.length-1; i >= 0; i--){
            System.out.print(str1[i]+" ");
        }
    }
}