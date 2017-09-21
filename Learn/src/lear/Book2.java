package lear;

public class Book2 {
     private String title;
     private double price;
    String pub="天天精彩出版社";//没有封装
    
    public   Book2(String title,double price) {
		this.title=title;
		this.price=price;
		}
	public void getInfo(){
		System.out.println("书名:"+this.title+"价格:"+this.price+"出版社:"+this.pub);
	}
    
    	
    
	public static void main(String[] args) {
		Book2 b1=new Book2("大耳朵图图",12);
		Book2 b2=new Book2("丁丁历险记",13);
		Book2 b3=new Book2("狮子王",14);
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		//将出版社名字一一改为“每日精彩出版色”
		System.out.println("---------出版社改名之后-------");
		b1.pub="每日精彩出版社";
		b2.pub="每日精彩出版社";
		b3.pub="每日精彩出版社";
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
        //思考：如果实例很多 还能这样一一去改名字吗?
	

}
}

