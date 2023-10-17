import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine();
        String result = "";
        for(int i = str.length(); i > 0; i--){
            if(!result.contains(str.substring(i-1,i))){
                result += str.substring(i-1,i);
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}