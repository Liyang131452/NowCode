import java.util.*;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ע�� hasNext �� hasNextLine ������
        //��ֵ��---�����뵽Map����Ҫ�ϲ�ͬ ����ͬ������ ����HashMap;
        //��¼��ֵ�Ը���
        int tableSize = in.nextInt();
        //����HashMap
        Map<Integer,Integer> hashMap = new HashMap<>(tableSize);
        for(int i = 0; i < tableSize; i++){
            int key = in.nextInt();
            int value = in.nextInt();
            if(hashMap.containsKey(key)){
                hashMap.put(key,hashMap.get(key)+value);
            }else{
                hashMap.put(key,value);
            }
        }
        for(Integer key : hashMap.keySet()){
            System.out.println(key+" "+hashMap.get(key));
        }
        
    }
}