import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        String str = in.nextLine();
        String result = "";
        for(int i = str.length(); i > 0; i--){
            if(!result.contains(str.substring(i-1,i))){
                result += str.substring(i-1,i);
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}