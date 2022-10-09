class insertsort{
	public static void main(String args[]){
		int arr[]={5,7,9,2,3,12,34,45};
		int i,j,temp;
	for(i=1;i<=7;i++){
		temp=arr[i];
		j=i-1;
		while(j>=0 && arr[j]>temp){
			
			arr[j+1]=arr[j];
			
			
			j--;
		}
		arr[j+1]=temp;
		
	}
		 System.out.println("Sorted list is :");
		   		   for(i=0;i<=7;i++){
					   System.out.println("{"+arr[i]+"}");
				   
				   } 
		
	}
}