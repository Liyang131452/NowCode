import java.util.Scanner;
import java.math.BigDecimal;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        while (in.hasNextBigDecimal()) { // ע�� while ������ case
            BigDecimal a = in.nextBigDecimal();
            BigDecimal b = in.nextBigDecimal();
            System.out.println(a.add(b));
        }
    }
}