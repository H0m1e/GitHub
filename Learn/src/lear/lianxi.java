package lear;

public class lianxi {
	public static int times(int[]oldArr) {//��Ϊ0�ĸ���,ƾ���������������
		int t=0;
		for (int i = 0; i < oldArr.length; i++) {
		 if (oldArr[i]!=0) {
			t++;
		}	
		}
		return t;
	}
   public static void copy(int[]oldData,int[]newData) {//�Ѿ���������ݸ��Ƶ�������
	  int foot=0;//�����������±�
	  for (int i = 0; i < oldData.length; i++) {
		if (oldData[i]!=0) {
			newData[foot]=oldData[i];
			foot++;
		}
	}
		
   }
   public static void print(int[]newArr) {
	for (int i:newArr) {
		System.out.println(i+"`");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int[]oldArr={4,0,5,0,1,0,1,0};
		int len=times(oldArr);//�õ���Ϊ0�ĸ���
		int newArr[]=new int[len];//��������Ϊlen������
		copy(oldArr, newArr);
		print(newArr);
		
        
	}

}
