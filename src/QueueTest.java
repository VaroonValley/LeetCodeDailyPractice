import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public void queueTest(int input, int K){

        if(K > input){
            throw new IllegalArgumentException();
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int reverse = K;
        for(int i = 0; i < input; i++){
            if(i < K){
                queue.add(reverse--);
            }
            else{
                queue.add(i + 1);
            }
        }

        System.out.println(queue);
    }
}
