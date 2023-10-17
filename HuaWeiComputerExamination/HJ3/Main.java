import java.util.Scanner; 
import java.util.Set;
import java.util.TreeSet;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
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