import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
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