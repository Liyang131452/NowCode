import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
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