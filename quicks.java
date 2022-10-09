import java.io.*;
class quicks{
	
	static int partition(int []arr,int lb,int ub){
		int start = lb=0;
		int end=ub=6;
		int Pivot=arr[lb];
		while(start < end){
		while(arr[start] <= Pivot){
			start++;
		}
		while(arr[end] > Pivot){
			end--;
		}
		if(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		
		}int temp2=arr[lb];
			arr[lb]=arr[end];
			arr[end]=temp2;
		
		return end;
	}
	static void quicksort(int []arr,int lb,int ub){
		if(lb < ub){
			
		 int loc = partition(arr,lb,ub);
		quicksort(arr,  lb,loc - 1);
		quicksort(arr, loc + 1,ub);
	}
	}
	static void printarray(int[] arr,int lb,int ub)
{
    for(int i = lb; i < ub; i++){
        System.out.print(arr[i]);
	}
    System.out.println();
}
	
	public static void main(String args[]){
		int arr[]={11,55,66,77,22,8,4};
		quicksort(arr,0,6);
		System.out.println("sorted array");
		printarray(arr,0,6);
	}
}