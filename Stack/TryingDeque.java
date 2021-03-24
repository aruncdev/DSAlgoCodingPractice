package Stack;

import java.util.*;

public class TryingDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.push(10);
		System.out.println(deque.isEmpty());
		System.out.println(deque.removeFirst());
		deque.addFirst(20);
		deque.addFirst(30);
		System.out.println(deque);
		System.out.println(deque.isEmpty());
	}

}
