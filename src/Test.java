

public class Test {
	
	public static void main(String[] args) {
		HuffmTree tree = new HuffmTree();
		HuffmNode root = tree.createTree();
		tree.getHuffmCode(root, "");
	}
 
}