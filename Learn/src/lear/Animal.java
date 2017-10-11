package lear;

 class Animal {
 public void move(){
	 System.out.println("¶¯ÎïÒÆ¶¯£¡");
 }
}
 class Fish extends Animal{
	 public void move() {
		System.out.println("Óã¶ùÓÎ£¡");
	}
 }
 class Bird extends Animal{
	 public void move() {
		System.out.println("Äñ¶ù·É£¡");
	}
 }
 class Horse extends Animal{
	 public void move() {
		System.out.println("Âí¶ùÅÜ£¡");
	}
 }