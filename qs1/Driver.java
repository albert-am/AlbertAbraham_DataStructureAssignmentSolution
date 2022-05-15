package com.greatLearning.Ques_1.drivers;

import com.greatLearning.Ques_1.model.Model;
import com.greatLearning.Ques_1.services.Services;
import java.util.*;

public class Driver {

public static void main(String[] args) {
		
		int n;		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		n = sc.nextInt();
		ArrayList<Integer> inputArrli = new ArrayList<Integer>();
		inputArrli = Model.creatInputArray(n);
		Services.orderConstruction(inputArrli);
	}
}