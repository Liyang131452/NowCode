import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        List<String> list = new ArrayList<>();
        while (in.hasNextInt()) { // ע�� while ������ case
            int nums = in.nextInt();
           for(int i = 0; i < nums; i++){
                list.add(in.next());
           }
           Collections.sort(list);
        }
       for(int i = 0; i < list.size() ;i++){
            System.out.print(list.get(i)+" ");
       }
    }
}