package data.structure;
/**
 * 
 * @author CYPRIAN DAVIS
 *
 */

public class TreeTest {
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.insertNode(38);
		tree.insertNode(72);
		tree.insertNode(26);
		tree.insertNode(90);
		tree.insertNode(78);
		tree.insertNode(74);
		tree.insertNode(92);
		tree.insertNode(55);
		tree.insertNode(60);
		tree.insertNode(41);
		tree.insertNode(43);
		tree.insertNode(10);
		tree.insertNode(20);
		
		//tree.traverseInorder();
		tree.rightSubTree();
		
	}

}
