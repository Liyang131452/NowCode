import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        String str = in.nextLine().toUpperCase();
        String str1 = in.nextLine().toUpperCase();
        int length = str.length()-str.replace(str1,"").length();
        System.out.println(length);       
    }
}