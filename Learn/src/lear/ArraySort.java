package lear;

public class ArraySort {
    public static void sort(int[]arr) {//ð�����򷽷�������һ���м�ֵteam �ѵ�һ��ֵ�ŵ�team���� �ѵڶ���ֵ�ŵ���һ��ֵ���棬�ٰ�team�����ֵ�ŵ��ڶ���ֵ����
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i]>arr[j]) {
					int team=arr[i];
					arr[i]=arr[j];
					arr[j]=team;
				}
			}
		}
	}
    public static void print(int[]arr,String msg) {
    	System.out.println(msg);
		for(int i:arr){
			System.out.println(i+"");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	int[]arr={4,5,8,3,6,1,};
    print(arr,"����ǰ��");
    sort(arr);
    print(arr, "�����");
    
    }

}
