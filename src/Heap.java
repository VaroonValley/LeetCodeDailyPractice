import java.util.Arrays;

public class Heap {
    private int[] arr = new int[10];
    private int count = 0;
    private int lastItem;

    public void insert(int val){

        arr[count++] = val;
        lastItem = val;
        int index = count-1;
        while(arr[(index-1)/2] < arr[index]){
            if(index < 0){
                return;
            }

            swap(index, (index-1)/2, arr);
            index = (index-1)/2;
        }
    }

    public void getLastItem(){
        System.out.println("Last item is " + lastItem);
    }

    public void getMax(){
        System.out.println("Max item is " + arr[0]);
    }

    public void print(){
        int[] newArr = new int[count];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

    private void swap(int first, int second, int[] arr){
        var temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
