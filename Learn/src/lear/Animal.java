package lear;

 class Animal {
 public void move(){
	 System.out.println("�����ƶ���");
 }
}
 class Fish extends Animal{
	 public void move() {
		System.out.println("����Σ�");
	}
 }
 class Bird extends Animal{
	 public void move() {
		System.out.println("����ɣ�");
	}
 }
 class Horse extends Animal{
	 public void move() {
		System.out.println("����ܣ�");
	}
 }