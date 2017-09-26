package lear;

public class lianxi {
	public static int times(int[]oldArr) {//不为0的个数,凭借此来创建新数组
		int t=0;
		for (int i = 0; i < oldArr.length; i++) {
		 if (oldArr[i]!=0) {
			t++;
		}	
		}
		return t;
	}
   public static void copy(int[]oldData,int[]newData) {//把久数组的数据复制到新数组
	  int foot=0;//创建新数组下标
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
		int len=times(oldArr);//得到不为0的个数
		int newArr[]=new int[len];//创建长度为len的数组
		copy(oldArr, newArr);
		print(newArr);
		
        
	}

}
