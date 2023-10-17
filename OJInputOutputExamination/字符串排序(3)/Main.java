import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        while (in.hasNextLine()) { // ע�� while ������ case
            String s = in.nextLine();
            String[] str = s.split(",");
            List<String> list = new ArrayList<>();
            for(int i = 0; i < str.length; i++){
                list.add(str[i]);
            }
            Collections.sort(list);
            int size = list.size();
            for (String s1:list){
                System.out.print(s1);
                if(size>1){
                    System.out.print(",");
                    size--;
                }
            }
            System.out.println();
        }
    }
}