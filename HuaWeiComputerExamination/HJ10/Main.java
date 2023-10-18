import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
/*      Set<String> ts = new TreeSet<>();
        String str = in.nextLine();
        String[] str1 = str.split("");
        for(int i = 0; i < str.length(); i++){
            if(str1[i] != "\n"){
                ts.add(str1[i]);
            }else{
                break;
            }
        }
*/
		Set<Character> ts = new TreeSet<>();
        String str = in.nextLine();
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) != '\n'){
                ts.add(str.charAt(i));
            }else{
                break;
            }
        } 
        System.out.println(ts.size());
    }
}