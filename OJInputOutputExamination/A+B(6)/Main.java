import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        while (in.hasNextInt()) { // ע�� while ������ case
            int firstInt = in.nextInt();
            int count = 0;
            for(int i = 0; i < firstInt; i++){
                count += in.nextInt();
            }
            System.out.println(count);
        }
    }
}