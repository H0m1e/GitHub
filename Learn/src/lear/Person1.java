package lear;

    public class Person1{
	private String name;
	private int x;
	//��������
	{
		System.out.println("�������鱻ִ��");
		x=10;
	}
	//���췽�������
	 Person1() {
		System.out.println("���췽���鱻ִ��");
		 name="�ܺ괨";
		 show();
	}
	//���췽�������
	Person1(String name){
		System.out.println("���췽���鱻ִ��");
		this.name=name;
		show();
	}
	void show(){
		System.out.println("welcome!!"+name);
		System.out.println("x="+x);
		}
	
}