import java.util.PriorityQueue;
import java.util.*;

class Lift {
    int id;
    int currentFloor;

    Lift(int id) {
        this.id = id;
        this.currentFloor = 0; // start at ground floor
    }

    void moveTo(int floor) {
        System.out.println("Lift " + id + " moving from floor " + currentFloor + " to floor " + floor);
        currentFloor = floor;
        System.out.println("Lift " + id + " reached floor " + currentFloor);
    }
}

public class queues {
    public static void main(String[] args){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(22);
        q.add(21);
        q.add(2);
        q.add(32);
        q.add(42);
        q.add(52);
        q.add(87);
        q.add(4);
        q.add(11);
        System.out.println("###########################################");
        System.out.println(q);
        System.out.println("###########################################");
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(2);
        q1.add(0);
        q1.add(3);
        q1.add(4);
        q1.add(null);
        q1.add(39);
        q1.add(8);
        q1.add(6);
        System.out.println(q1);
        System.out.println("###########################################");
        System.out.println(q1.contains(39));
        q1.addAll(q);
        System.out.println("###########################################");
        System.out.println(q1);
        System.out.println("###########################################");
        System.out.println(q.poll());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(q1.peek());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        q.offer(90);
        q.remove(52);
        q.remove(22);
        System.out.println(q);
        System.out.println("###########################################");

        Queue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder());
        q2.add(9);
        q2.add(8);
        q2.add(4);
        q2.add(6);
        q2.add(1);
        q2.add(7);
        System.out.println(q2);
        System.out.println("###########################################");
        for (Integer i:q1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("###########################################");
        System.out.println("*******************************************");
        Lift lift1 = new Lift(1);
        Lift lift2 = new Lift(2);

        // Use a queue for lift requests
        Queue<Integer> requests = new LinkedList<>();
        requests.add(5);
        requests.add(2);
        requests.add(8);
        requests.add(3);

        System.out.println("Requests: " + requests);

        // Assign requests alternately to lifts
        boolean turn = true;
        while (!requests.isEmpty()) {
            int floor = requests.poll();
            if (turn) {
                lift1.moveTo(floor);
            } else {
                lift2.moveTo(floor);
            }
            turn = !turn;
        }

        System.out.println("All requests served.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("###########################################");
        System.out.println("*******************************************");



        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(30);

        System.out.println("Deque after additions: " + dq);
        System.out.println("###########################################");
        System.out.println("peekFirst() -> " + dq.peekFirst()); // 5
        System.out.println("peekLast() -> " + dq.peekLast());   // 30
        System.out.println("###########################################");
        System.out.println("removeFirst() -> " + dq.removeFirst());
        System.out.println("removeLast() -> " + dq.removeLast());
        System.out.println("###########################################");
        System.out.println("Deque after removals: " + dq);
        System.out.println("###########################################");
        dq.addFirst(100);
        dq.addLast(200);
        System.out.println("###########################################");
        System.out.println("Deque after adding again: " + dq);
        System.out.println("###########################################");
        System.out.println("pollFirst() -> " + dq.pollFirst());
        System.out.println("pollLast() -> " + dq.pollLast());
        System.out.println("###########################################");
        System.out.println("Deque after polls: " + dq);
        System.out.println("###########################################");
        System.out.print("Iterating front to back: ");
        for (int x : dq) {
            System.out.print(x + " ");
        }
    }
}
