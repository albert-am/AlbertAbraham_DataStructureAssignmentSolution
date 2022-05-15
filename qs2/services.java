package com.greatLearning.Ques_2.Services;

import com.greatLearning.Ques_2.Model.Model.Node;

public class Services {
	
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;
	public	static void BSTToSkewed (Node root,int order)	{
		
		// Base Case
		if(root == null)
		{
			return ;
		}
	
		// Condition to check the order
		// in which the skewed tree to
		// maintained
		if(order > 0)
		{
			BSTToSkewed(root.right, order);
		}
		else
		{
			BSTToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		// Condition to check if the root Node
		// of the skewed tree is not defined
	
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		// Similarly recurse for the left / right
		// subtree on the basis of the order required
		if (order > 0)
		{
			BSTToSkewed(leftNode, order);
		}
		else
		{
			BSTToSkewed(rightNode, order);
		}
		
	}
	

	public static void printRightSkewed(Node root) {
		
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		printRightSkewed(root.right);	
	}

	public static void getBSTtoSkewed(Node root,int order) {
		BSTToSkewed(root, order);
		printRightSkewed(headNode);
		
	}
}