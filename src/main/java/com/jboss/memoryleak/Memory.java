package com.jboss.memoryleak;

/**
 * 
 * @author bmincey
 *
 */
public class Memory {

	private static final int MB = 1024 * 1024;
	private static final Runtime runTime = Runtime.getRuntime();
	
	/**
	 * 
	 */
	public Memory(){
		
	}
	
	/**
	 * 
	 */
	public static void getUsedMemory(){
		long usedMemory = (runTime.totalMemory() - runTime.freeMemory()) / MB;
		System.out.println("Used Memory: " + usedMemory + " MB");
	}
	
	/**
	 * 
	 */
	public static void getFreeMemory(){
		long freeMemory = runTime.freeMemory() / MB;
		System.out.println("Free Memory: " + freeMemory + " MB");
	}
	
	/**
	 * 
	 */
	public static void getTotalMemory(){
		long totalMemory = runTime.totalMemory() / MB;
		System.out.println("Total Memory: " + totalMemory + " MB");
	}
	
	/**
	 * 
	 */
	public static void getMaxMemory(){
		long maxMemory = runTime.maxMemory() / MB;
		System.out.println("Max Memory: " + maxMemory + " MB");
	}
	
	/**
	 * 
	 */
	public static void getMemory(){
		Memory.getUsedMemory();
		Memory.getFreeMemory();
		Memory.getTotalMemory();
		Memory.getMaxMemory();
	}
}
