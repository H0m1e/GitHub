package lear;

public class Book {
    private String title;
    private double price;
   public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 public  void printlnfo(){
	    System.out.println(title+"+"+price);
		
	    }
	public static void main(String[] args) {
		Book bookA = new Book();
		bookA.setTitle("����A");
		bookA.setPrice(10);
		Book bookB = new Book();
		bookB.setPrice(20);
		bookB.setTitle("����B");
		bookA = bookB;
		bookB.printlnfo();//Ϊʲô����������bookB�����ԣ�
        
	}

}
