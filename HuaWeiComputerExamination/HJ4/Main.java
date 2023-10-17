import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine();
        char[] ch = str.toCharArray();
        int last;
        int lenght = ch.length;
        for (int i = 0; i < lenght; i++) {
            if(i>1&&i%8==0){
                System.out.println();
            }
            System.out.print(ch[i]);
        }
        if ((last = 8 - (lenght % 8)) != 8) {
            for (int i = 0; i < last; i++) {
                System.out.print(0);
            }
        }
    }
}