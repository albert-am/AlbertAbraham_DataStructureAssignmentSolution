package com.greatLearning.Ques_2.Driver;

import com.greatLearning.Ques_2.Model.Model;
import com.greatLearning.Ques_2.Services.Services;

public class Main {

	public static Model.Node node ;
	static Model.Node prevNode = null;
	static Model.Node headNode = null;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Main tree = new Main();
		tree.node = new Model.Node(50);
		tree.node.left = new Model.Node(30);
		tree.node.right = new Model.Node(60);
		tree.node.left.left = new Model.Node(10);
		tree.node.right.left= new Model.Node(55);
		
		int order = 0;
		
		Services.getBSTtoSkewed(node, order );
		
	}

}