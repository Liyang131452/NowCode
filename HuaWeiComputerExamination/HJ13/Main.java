import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        String str = in.nextLine();
        String[] str1 = str.split(" ");
        for(int i = str1.length-1; i >= 0; i--){
            System.out.print(str1[i]+" ");
        }
    }
}