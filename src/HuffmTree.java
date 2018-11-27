import java.util.LinkedList;
 
public class HuffmTree {
	
	public int [] datas ={2,1,6,4,7,9,12,3};
	public LinkedList<HuffmNode> list = new LinkedList<HuffmNode>();
	
	public HuffmNode createTree() {
		//按照从小到大的将数据封装成节点
		for (int i = 0; i < datas.length; i++) {
			HuffmNode node = new HuffmNode(datas[i]);
			//得到需要插入的位置索引
			int index=getIndex(node);
			//将数据添加到容器中
			list.add(index, node);
		}
		//构造哈夫曼树
		while(list.size()>1){
			//移除容器中的第一个节点
			HuffmNode firstNode =list.removeFirst();
			//容器中原来的第二个节点变成新的第一个节点
			HuffmNode secondNode =list.removeFirst();
			//构造父节点数据域
			HuffmNode fatherNode = new HuffmNode(firstNode.getData()+secondNode.getData());
			//构造父节点左子叶
			fatherNode.setLeft(firstNode);
			//构造父节点右子叶
			fatherNode.setRight(secondNode);
			//得到构造好的父节点的索引
			int index=getIndex(fatherNode);
			//将父节点加入森林
			list.add(index, fatherNode);
		}
		//返回根节点
		return list.getFirst();
	}
	
	//得到索引 在现有list中按大小排，找到应该排放的位置
	public int getIndex(HuffmNode node) {
		for (int i = 0; i < list.size(); i++) {
			if(node.getData()>list.get(i).getData()){
				continue;//跳出本次循环，而break是跳出到外层循环
			}else {
				return i;
			}
		}
		//如果比容器中的任何一个数大，则插入最后面
		return list.size();
	}
	
	//得到哈夫曼编码
	public void getHuffmCode(HuffmNode root,String code) {
		if(root.getLeft()!=null){
			getHuffmCode(root.getLeft(),code+"0");
		}
		if(root.getRight()!=null){
			getHuffmCode(root.getRight(),code+"1");
		}
		if(root.getLeft()==null && root.getRight()==null){
			System.out.println(code);
		}
	}
}




