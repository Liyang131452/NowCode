import java.util.Scanner; 
import java.util.Set;
import java.util.TreeSet;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        int lenght = in.nextInt();
        Set<Integer> ts = new TreeSet();
        for(int i = 0; i < lenght; i++){
            ts.add(in.nextInt());
        }
       for(int i : ts){
        System.out.println(i);
       }
    }
}