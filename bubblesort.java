class bubblesort{
	public static void main(String args[]){
		int arr[]={9,8,7,6,5,4,3,2};
		   int i , j , temp;
		   for(i=0;i<7;i++){
			   for(j=0;j<7-i;j++){
				   if(arr[j]>arr[j+1]){
					   temp = arr[j];
					   arr[j]= arr[j+1];
					   arr[j+1]=temp;
				   }
			   }
		   }
		   System.out.println("Sorted list is :");
		   		   for(i=0;i<7;i++){
					   System.out.println("{"+arr[i]+"}");
				   
				   }  
	}
}