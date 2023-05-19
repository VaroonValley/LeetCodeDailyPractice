import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static ArrayList<Integer> getSum(LinkedList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != 0){
                sum = sum + list.get(i);
            }
            if(list.get(i) == 0 && i != 0){
                arr.add(sum);
                sum = 0;
            }
        }
        return arr;
    }
}
