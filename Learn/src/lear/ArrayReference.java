package lear;

public class ArrayReference {
	//���巽���ı�����ֵ
    public static void changeReferValue(int[]myArr){
    	myArr[0]=0;
    	myArr[1]=0;
    	myArr[2]=0;
    }
    //�������
    public static void printArr(int[]arr) {
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			}
	}
    //������
    public static void print(int[]arr) {
		System.out.println("arr:");
		printArr(arr);
	}
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5};
    print(arr);
    System.out.println("ʹ��changeReferValue��������");
    changeReferValue(arr);
    print(arr);
	}

}
