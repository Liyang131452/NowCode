import java.util.*;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
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