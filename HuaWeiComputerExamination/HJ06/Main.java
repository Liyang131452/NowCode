import java.util.*;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        long num = in.nextInt();
        long nums = (long)Math.sqrt(num);
        long k = 2;
        while(k <= nums){
            if(num % k == 0){
                System.out.print(k+" ");
                num /= k;
            }else{
                k++;
            }
        }
         System.out.println(num == 1 ? "" : num);
    }
}