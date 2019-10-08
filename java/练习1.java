package test;

import java.util.Random;

public class demo_01 {
	
	private static Random ran = new Random();
	private final int value1=ran.nextInt(10);
	private static final int value2=ran.nextInt(10);

	public static void main(String[] args) {
//		for (;;) {
			demo_01 data1=new demo_01();
			System.out.println(data1.value1);
			System.out.println(data1.value2);
			System.out.println();
			demo_01 data2=new demo_01();
			System.out.println(data2.value1);
			System.out.println(data2.value2);
			
//		}
	}

}
