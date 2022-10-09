import java.io.*;
class quick{
static void swap(int [] arr,int i,int j){
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
static int partition(int[] arr,int lb,int ub){
	start=lb;
	end=ub;
	int pivot = arr[lb];
	while(start<end){
		while(arr[start]<=pivot){
			start++;
		}
		while(arr[end]>pivot){
			end--;
		}
		if(start<end){
			swap(int[] arr,start,end);
		}
	}
	swap(int[]arr,lb,end);
	return end;
}

      static void quicksort(int[] arr,int lb,int ub){
		  int loc = partition(int [] arr,lb,ub);
		  quicksort(arr,lb,loc-1);
		  quicksort(arr,loc+1,ub);
	  }
	  static void printarray(int [] arr,int size){
		   for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
          
    System.out.println();
		  
	  }
	  public static void main(String[] args)
{
    int[] arr = { 10, 7, 8, 9, 1, 5 };
    int n = arr.length;
      
    quickSort(arr, 0, n - 1);
    System.out.println("Sorted array: ");
    printArray(arr, n);
}
}