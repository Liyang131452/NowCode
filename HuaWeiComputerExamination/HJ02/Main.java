import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine().toUpperCase();
        String str1 = in.nextLine().toUpperCase();
        int length = str.length()-str.replace(str1,"").length();
        System.out.println(length);       
    }
}