package com.jboss.memoryleak;

import java.util.LinkedList;
import java.util.List;

/**how 
 * 
 * @author bmincey
 *
 */
public class MemoryLeak {
	
	/**
	 * 
	 */
	MemoryLeak(){
		
	}
	
	/**
	 * 
	 */
	public static void startMemoryLeak() {
		List<long[]> myList = new LinkedList<long[]>();
		int counter = 0;
		while(true) {
			myList.add(new long[1024 * 2048]);
			System.out.println("Iteration " + ++counter);
			Memory.getUsedMemory();
			System.out.println("\n");
			sleep(1000);
		}
		
	}
	
	/**
	 * 
	 * @param milliSeconds
	 */
	private static void sleep(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
