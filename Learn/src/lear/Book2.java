package lear;

public class Book2 {
     private String title;
     private double price;
    String pub="���쾫�ʳ�����";//û�з�װ
    
    public   Book2(String title,double price) {
		this.title=title;
		this.price=price;
		}
	public void getInfo(){
		System.out.println("����:"+this.title+"�۸�:"+this.price+"������:"+this.pub);
	}
    
    	
    
	public static void main(String[] args) {
		Book2 b1=new Book2("�����ͼͼ",12);
		Book2 b2=new Book2("�������ռ�",13);
		Book2 b3=new Book2("ʨ����",14);
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		//������������һһ��Ϊ��ÿ�վ��ʳ���ɫ��
		System.out.println("---------���������֮��-------");
		b1.pub="ÿ�վ��ʳ�����";
		b2.pub="ÿ�վ��ʳ�����";
		b3.pub="ÿ�վ��ʳ�����";
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
        //˼�������ʵ���ܶ� ��������һһȥ��������?
	

}
}

