package com.ibm.banking.basics;

public class DemoArrays {
//	static int[] intarr ;
//	static {
//		
//		intarr = new int[5];
//	}
	int[] arr;
	public void intandprintarray() {
		arr = new int[5];
		for(int i = 0 ; i < 5 ; i++) {
			arr[i] = i+i*2;
			
		}
		for (int i : arr) {
			System.out.println(i+"\t");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		DemoArrays demo = new DemoArrays();
		demo.intandprintarray();
		System.out.println();
	}
}
