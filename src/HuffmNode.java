
public class HuffmNode {
	//����HuffmNode��
	private int data;
	private HuffmNode left;
	private HuffmNode right;
	//HuffmNode�๹�캯��
	public  HuffmNode(int data) {
		this.data=data;
	}
	
	//��װ����
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public HuffmNode getLeft() {
		return left;
	}
	public void setLeft(HuffmNode left) {
		this.left = left;
	}
	public HuffmNode getRight() {
		return right;
	}
	public void setRight(HuffmNode right) {
		this.right = right;
	}
 
}


