package lear;

   class Class {
    int Num;
    String Name;
    public void Student(int Num,String Name){
    	this.Name=Name;
    	this.Num=Num;
    	}
    public String talk() {
		return "�ҽ�"+Name+"�ҵ�ѧ����"+Num;
		
	}
    }
   class Classes extends Class{
	    String School;
	    public  void Person(int Num,String Name,String School){
	    	super.Student(Num, Name);//���ø���Ĺ��췽��
	    	this.School=School;
	    }
	    public void Study() {
			System.out.println(talk());//ֱ�ӵ��ø���ķ���
		}
	   //�̳о��ǿ���������ø���Ĺ��췽�������ԣ������Ĭ���ȵ��ø�����޲ι��췽����Ȼ���ٵ����Լ��Ĺ��췽��
   



}
