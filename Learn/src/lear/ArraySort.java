package lear;

public class ArraySort {
    public static void sort(int[]arr) {//冒泡排序方法：设置一个中间值team 把第一个值放到team里面 把第二个值放到第一个值里面，再把team里面的值放到第二个值里面
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
    print(arr,"排序前：");
    sort(arr);
    print(arr, "排序后");
    
    }

}
