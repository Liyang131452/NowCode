import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        while (in.hasNextLine()) { // ע�� while ������ case
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