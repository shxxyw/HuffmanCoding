import java.util.LinkedList;
 
public class HuffmTree {
	
	public int [] datas ={2,1,6,4,7,9,12,3};
	public LinkedList<HuffmNode> list = new LinkedList<HuffmNode>();
	
	public HuffmNode createTree() {
		//���մ�С����Ľ����ݷ�װ�ɽڵ�
		for (int i = 0; i < datas.length; i++) {
			HuffmNode node = new HuffmNode(datas[i]);
			//�õ���Ҫ�����λ������
			int index=getIndex(node);
			//��������ӵ�������
			list.add(index, node);
		}
		//�����������
		while(list.size()>1){
			//�Ƴ������еĵ�һ���ڵ�
			HuffmNode firstNode =list.removeFirst();
			//������ԭ���ĵڶ����ڵ����µĵ�һ���ڵ�
			HuffmNode secondNode =list.removeFirst();
			//���츸�ڵ�������
			HuffmNode fatherNode = new HuffmNode(firstNode.getData()+secondNode.getData());
			//���츸�ڵ�����Ҷ
			fatherNode.setLeft(firstNode);
			//���츸�ڵ�����Ҷ
			fatherNode.setRight(secondNode);
			//�õ�����õĸ��ڵ������
			int index=getIndex(fatherNode);
			//�����ڵ����ɭ��
			list.add(index, fatherNode);
		}
		//���ظ��ڵ�
		return list.getFirst();
	}
	
	//�õ����� ������list�а���С�ţ��ҵ�Ӧ���ŷŵ�λ��
	public int getIndex(HuffmNode node) {
		for (int i = 0; i < list.size(); i++) {
			if(node.getData()>list.get(i).getData()){
				continue;//��������ѭ������break�����������ѭ��
			}else {
				return i;
			}
		}
		//����������е��κ�һ����������������
		return list.size();
	}
	
	//�õ�����������
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




