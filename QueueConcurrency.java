package com.concurrentqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueConcurrency {
	public static void main(String args[]) throws InterruptedException {
		ArrayBlockingQueue queue=new ArrayBlockingQueue(5);
		
		for(int i=0;i<5;i++) {
			queue.put(i);
		}
		queue.add(25);
		
			System.out.println(queue);
	}
}
