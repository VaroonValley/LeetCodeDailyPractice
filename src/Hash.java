import java.util.HashMap;

public class Hash {
    private HashMap<Integer, Integer> map = new HashMap<>();
    int size;
    public void insert(int[] arr){
        for (int i : arr) {
            if(map.get(i) != null){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 0);
            }
        }
        size++;
    }

    public int firstRepeatedCharacter() {
        if(size == 0){
            return -1;
        }
        for (int i : map.keySet()) {
            if(map.get(i) > 0){
                return i;
            }
        }
        return (int) map.keySet().toArray()[0];
    }
    public int nonRepeatedCharacter() {
        if(size == 0){
            return -1;
        }
        for (int i : map.keySet()) {
            if(map.get(i) == 0){
                return i;
            }
        }
        return (int) map.keySet().toArray()[0];
    }
    public int mostRepeatedCharacter() {
        if(size == 0){
            return -1;
        }
        int result = map.get(map.keySet().toArray()[0]);
        for (int i : map.keySet()) {
            if(map.get(i) > result){
                result = i;
            }
        }
        return result;
    }
}

