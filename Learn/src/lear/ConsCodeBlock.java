package lear;

public class ConsCodeBlock {

	public static void main(String[] args) {
		Person p=new Person();
		System.out.println("--------------");
		Person p1=new Person("chuan");
		

	}

}
class Person{
	private String name;
	private int x;
	//��������
	{
		System.out.println("�������鱻ִ��");
		x=10;
	}
	//���췽�������
	Person() {
		System.out.println("���췽���鱻ִ��");
		 name="�ܺ괨";
		 show();
	}
	//���췽�������
	Person(String name){
		System.out.println("���췽���鱻ִ��");
		this.name=name;
		show();
	}
	void show(){
		System.out.println("welcome!!"+name);
		System.out.println("x="+x);
		}
	
}