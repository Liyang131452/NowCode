import java.util.Scanner;
 
// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
       int nums = in.nextInt();
       for(int i = 0; i < nums; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
       }
    }
}