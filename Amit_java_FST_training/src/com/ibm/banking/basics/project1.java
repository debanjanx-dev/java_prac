package com.ibm.banking.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project1 {
	public static void reverseString() {
	    Scanner sca = new Scanner(System.in);
	    System.out.print("Input String: ");
	    char[] chars = sca.nextLine().toCharArray();

	    int left = 0, right = chars.length - 1;
	    while (left < right) {
	        char temp = chars[left];
	        chars[left] = chars[right];
	        chars[right] = temp;
	        left++;
	        right--;
	    }

	    System.out.println("Reversed String: " + new String(chars));
	}
	
	
	public static void ASCIIvalue() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Character ::");
		String input = sca.nextLine();
		char[] chars = input.toCharArray();
        System.out.println("Character  ->  ASCII Value");

        for(char c : chars) {
        	System.out.println((int) c);
        }
	}
	
	
	
	
	public static void AddArray() {
		Scanner sca = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter number of elements: ");
        int n = sca.nextInt();
        System.out.println("Enter " + n + " elements:");
        for(int i = 0 ; i <= n ; i++) {
        	arr.add(sca.nextInt());
        }
        System.out.println("ArrayList elements: " + arr);
        sca.close();
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		reverseString();
		ASCIIvalue();
		AddArray();
	}
}



