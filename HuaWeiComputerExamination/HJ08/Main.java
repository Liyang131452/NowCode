import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //键值对---首先想到Map，又要合并同 键相同的数据 采用HashMap;
        //记录键值对个数
        int tableSize = in.nextInt();
        //创建HashMap
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