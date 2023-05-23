public class App {
    public static void main(String[] args) throws Exception {
        String string = "{(1+2)+{(((8))+1})}";
        Stacks stack = new Stacks();
        if(stack.isBalanced(string)){
            stack.findBrackets(string);
        }

        // int[] array = {1,2,3,4,5};
        // Array arr = new Array();
        
        // System.out.println(arr.kthLar(array, 1));

        // LinkedList<Integer> list = new LinkedList<>();
        // list.addLast(0);
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(0);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(0);
        // list.addLast(1);
        // list.addLast(1);
        // list.addLast(1);
        // list.addLast(0);

        // System.out.println(LinkedListTest.getSum(list));

        QueueTest queue = new QueueTest();
        queue.queueTest(5, 3);
    }
}
