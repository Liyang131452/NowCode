import java.util.Scanner;
 
// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
       int numsLine = in.nextInt();
       for(int i = 0; i < numsLine; i++){
        int firstInt = in.nextInt();
        int count = 0;
        while(firstInt != 0){
            count += in.nextInt();
            firstInt --;
        }
        System.out.println(count);
       }
    }
}