package lear;

public class Animals {

	public static void main(String[] args) {
		Animal a=new Animal();
		Fish fish=new Fish();
		a=fish;
		a.move();
	}
    //继承是子类继承父类的方法，多态则是父类调用子类的方法，父类只能调用同名的子类的方法，不同名的不能调用。
}
