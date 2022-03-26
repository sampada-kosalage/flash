package QueDeque;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Training {

	public static void main(String [] args) {
		//Queue<Integer>queue=new LinkedBlockingQueue<>();
		Queue<Integer>queue=new ArrayBlockingQueue<>(6);

		System.out.println(queue.peek());
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		System.out.println(queue.offer(7));
		//System.out.println(queue.offer(1));


		for(Integer element:queue) {
			System.out.println(element);

		}
		System.out.println("___________");
		System.out.println(queue.peek());


		System.out.println("Remove element from queue:"+queue.poll());
		
		//for(Integer element:queue) {
		//System.out.println("First element in queue:"+queue.element());
			//System.out.println(element);
		}
	}

