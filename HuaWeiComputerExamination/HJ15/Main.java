import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int num= in.nextInt();
        int count = 0;
        //String str = Integer.toBinaryString(num);
        //System.out.println(str.length()-str.replace("1","").length());
        for(int i = 0; i < 32; i++){
            if(1 == (num&1)){
                count++;
            }
            num >>>= 1;
        }
        System.out.println(count);
    }
}