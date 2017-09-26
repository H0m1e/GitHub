package lear;

public class ArrReturn {
    public static int[] sort(int[]arr) {
		//√∞≈›≈≈–Ú
    	for(int i=0;i<arr.length;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if (arr[i]<arr[j]) {
					int team=arr[i];
					arr[i]=arr[j];
					arr[j]=team;
				}
    		}
    	}
    	return arr;
	}
    public static void print(int[]arr,String msg) {
		System.out.println(msg);
		for(int i:arr){
			System.out.println(i+"");
		}
	}
	public static void main(String[] args) {
		int[] arr={4,8,1,1,5,5,4};
		int[] newArr;
		print(arr,"≈≈–Ú«∞£∫");
		newArr=sort(arr);
		print(newArr, "≈≈–Ú∫Û");

	}

}
