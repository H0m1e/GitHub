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
	//构造代码块
	{
		System.out.println("构造代码块被执行");
		x=10;
	}
	//构造方法代码块
	Person() {
		System.out.println("构造方法块被执行");
		 name="曹宏川";
		 show();
	}
	//构造方法代码块
	Person(String name){
		System.out.println("构造方法块被执行");
		this.name=name;
		show();
	}
	void show(){
		System.out.println("welcome!!"+name);
		System.out.println("x="+x);
		}
	
}