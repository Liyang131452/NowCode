import java.util.*;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = in.next();
        }
        Arrays.sort(str);
        for(int i = 0; i < n; i++){
            System.out.println(str[i]);
        }
    }
}