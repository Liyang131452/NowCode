import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        int num= in.nextInt();
        int count = 0;
        //String str = Integer.toBinaryString(num);
        //System.out.println(str.length()-str.replace("1","").length());
        for(int i = 0; i < 32; i++){
            if(1 == (num&1)){
                count++;
            }
            num >>>= 1;
        }
        System.out.println(count);
    }
}