package compress;


public class Test {
	public static void main(String[] args) throws Exception {
		//����ѹ������
		Compress compress = new Compress();
		//ͳ���ļ���0-255���ֵĴ���
		compress.countTimes("C:\\Users\\shxxy\\Desktop\\my.txt");
		//����������������õ����ڵ�
		HuffmNode root=compress.createTree();
		//�õ�����������
		compress.getHuffmCode(root, "");
		//ѹ���ļ�
		compress.compress("C:\\Users\\shxxy\\Desktop\\my.txt",
				"C:\\Users\\shxxy\\Desktop\\my2.docx.zip");
		
	}
 
}


