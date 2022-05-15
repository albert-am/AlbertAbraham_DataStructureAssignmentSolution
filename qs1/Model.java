package com.greatLearning.Ques_1.model;

import java.util.*;

public class Model {

	public  static ArrayList<Integer> creatInputArray(int n) {
		
		ArrayList<Integer> arrliInput = new ArrayList<Integer>(n);
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the floor size given on day : " + i);
			arrliInput.add(sc.nextInt());			
		}
		System.out.println();
		
		
		System.out.println("The order of construction is as follows ");
		System.out.println();
		return arrliInput;
	}
}