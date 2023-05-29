import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // //AVLTree
        // AVLTree avl = new AVLTree();
        // avl.insert(1);
        // avl.insert(2);
        // avl.insert(3);
        // avl.insert(4);
        // avl.insert(5);

        // Heap
        Heap heap = new Heap();
        heap.insert(21);
        heap.insert(2);
        heap.insert(4);
        heap.insert(3);
        heap.insert(50);
        heap.print();
        heap.getLastItem();
        heap.getMax();

        // String string = "{(1+2)+{(((8))+1})}";
        // Stacks stack = new Stacks();
        // if(stack.isBalanced(string)){
        //     stack.findBrackets(string);
        // }

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

        // QueueTest queue = new QueueTest();
        // queue.queueTest(5, 3);
        // List<Integer> list = new ArrayList<>();
        // BinaryTree tree = new BinaryTree();
        // tree.insert(1);
        // tree.insert(2);
        // tree.insert(3);
        // tree.insert(4);
        // tree.insert(5);

        // BinaryTree tree2 = new BinaryTree();
        // tree2.insert(1);
        // tree2.insert(2);
        // tree2.insert(3);
        // tree2.insert(4);
        // tree2.insert(5);

        // for(int i = 0; i < tree.size(); i++){
        //     list.add(tree.nodeAt(i).get(0));
        // }
        
        // for(int i = 0; i < tree2.size(); i++){
        //     list.add(tree2.nodeAt(i).get(0));
        // }

        // Collections.sort(list);
        // System.out.println(list);
    }
}
