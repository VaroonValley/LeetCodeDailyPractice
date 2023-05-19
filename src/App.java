import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5};
        Array arr = new Array();
        
        System.out.println(arr.kthLar(array, 1));

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(0);
        list.addLast(2);
        list.addLast(3);
        list.addLast(0);
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(0);

        System.out.println(LinkedListTest.getSum(list));
    }
}
