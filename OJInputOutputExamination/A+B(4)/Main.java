import java.util.Scanner;
 
// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        int firstInt;
        while (in.hasNextInt()) { // ע�� while ������ case
            if((firstInt = in.nextInt())!=0){               
                int count = 0;
                for(int i = 0;i < firstInt; i++){
                    count += in.nextInt();
                }
                System.out.println(count);
            }else{
                break;
            }
        }
    }
}