import java.util.Scanner;
 
// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        while (in.hasNextInt()) { // ע�� while ������ case
            int a = in.nextInt();
            int b = in.nextInt();
            if(0 == a && 0 == b){
                break;
            }
            System.out.println(a + b);
             
        }
    }
}