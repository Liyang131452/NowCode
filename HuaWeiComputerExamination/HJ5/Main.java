import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        System.out.println(Integer.parseInt(s.substring(2,s.length()),16));        
    }
}