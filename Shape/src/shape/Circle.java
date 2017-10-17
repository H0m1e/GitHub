package shape;

import java.util.Scanner;

class Circle extends Shape{
	
     public void girth(){
    	 System.out.println("«Î ‰»Î∞Îæ∂£∫");
		 Scanner scanner= new Scanner(System.in);
		 double r=scanner.nextDouble();
		 double C=6.28*r;
		 System.out.println(C);
     }
     
}
