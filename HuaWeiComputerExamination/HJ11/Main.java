import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //int num = in.nextInt();
        //String str = Integer.toString(num);
        //String str = String.valueOf(num);
        String str = in.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        /*for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }*/
    }
}