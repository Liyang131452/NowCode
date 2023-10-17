import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        List<String> list = new ArrayList<>();
        while (in.hasNextInt()) { // 注意 while 处理多个 case
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