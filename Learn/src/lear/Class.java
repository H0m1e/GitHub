package lear;

   class Class {
    int Num;
    String Name;
    public void Student(int Num,String Name){
    	this.Name=Name;
    	this.Num=Num;
    	}
    public String talk() {
		return "我叫"+Name+"我的学号是"+Num;
		
	}
    }
   class Classes extends Class{
	    String School;
	    public  void Person(int Num,String Name,String School){
	    	super.Student(Num, Name);//调用父类的构造方法
	    	this.School=School;
	    }
	    public void Study() {
			System.out.println(talk());//直接调用父类的方法
		}
	   //继承就是可以子类调用父类的构造方法与属性，子类会默认先调用父类的无参构造方法，然后再调用自己的构造方法
   



}
