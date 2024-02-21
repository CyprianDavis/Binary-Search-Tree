package data.structure;
/**
 * Simplified Binary Tree
 * @author CYPRIAN DAVIS
 *
 */
public class BinaryTree {
	//Node class
	private class Node{
		int item;	//Item stored at this node
		Node leftChild;	//left child of the node
		Node rightChild;	//right child of the node
		
		Node(int element){
			this.item = element;
			leftChild = null;
			rightChild = null;
		}
		
		
	}//end of node class

	private Node root; //root node of the tree
	
	//returns root node
	public Node getRoot() {
		return this.root;
		
		
	}
	public void insertNode(int value) {
		root = addNodeRecursively(root, value);
		
	}
	public boolean contains(int value) {
		return findRecursively(root, value);
		
	}
	//Add a new node to its position on the tree
	private Node addNodeRecursively(Node node, int value) {
		//if tree is empty
		if(node == null) {
			node = new Node(value);
				return node;
		}
		//if value is less than root add recursively to the left
		if(value < node.item) {
			node.leftChild = addNodeRecursively(node.leftChild,value);
		}
		//if value is greater than root add recursively to right
		if(value > node.item) {
			node.rightChild = addNodeRecursively(node.rightChild,value);
		}
		return node;
	}
	private boolean findRecursively(Node node,int value) {
		//checks if the tree is empty
		if(node == null) {
			return false;
		}
		//checks if the value is at the root of the tree
		if(node.item == value) {
			return true;
		}
		//checks if the element is at the left subtree
		if(value < node.item) {
			return findRecursively(node.leftChild,value);
		}
		//checks if the value is at the right sub tree
		else {
			return findRecursively(node.rightChild,value);
		}
	}
	//Inorder traversal of the tree
	public void traverseInorder() {
		//start from the root node
		traverseInorder(root);
	}
	//PreOrder traversal of the tree
	public void traversePreOrder() {
		traversePreOrder(root);
	}
	//PostOrder traversal of tree
	public void traversePostOrder() {
		traversePostOrder(root);
		
	}
	//LeftSub Tree InOder
	public void leftSubTree() {
		traverseSubTree(root.leftChild);	
	}
	//Right sub Tree Inoder
	public void rightSubTree() {
		traverseSubTree(root.rightChild);
		
	}
	//traverses the tree inOrder recursively
	private void traverseInorder(Node root) {
		if(root != null) {
			traverseInorder(root.leftChild);
			System.out.println(" "+root.item);
			traverseInorder(root.rightChild);
		}
	}
	//Traverses the tree in PreOrder recursively
	private void traversePreOrder(Node root) {
		if(root != null) {
			System.out.print(root.item);
			traversePreOrder(root.leftChild);
			traversePreOrder(root.rightChild);
		}
	}
	//Traverses the tree in PostOrder recursively
	private void traversePostOrder(Node root) {
		if(root != null) {
			traversePostOrder(root.leftChild);
			traversePostOrder(root.rightChild);
			System.out.println(" "+root.item);
		}
	}
	private void traverseSubTree(Node current) {
		if(current != null) {
			
			traverseSubTree(current.leftChild);
			System.out.print(" "+current.item);
			traverseSubTree(current.rightChild);
		}
	}
	
	
	
	
	
}
