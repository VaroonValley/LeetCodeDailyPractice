import java.util.Arrays;

public class Array {
    public String kthLar(int[] array,int k){
        Arrays.sort(array);
        if(k == 1){
            return "result = " + array[array.length-1];
        }
        var lar = 1;
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i > 0; i--) {
                if(array[i] != array[i-1]){
                    lar = lar + 1;
                }
                if(lar == k){
                   return  "result = " + array[i - 1];
                }
        }
        return "Out of bound";
    }
}
