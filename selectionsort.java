class selectionsort{
	public static void main(String args[]){
		int arr[]={10,50,30,80,20};
		int i,j,temp;
		for(i=0;i<=3;i++){
			for(j=i+1;j<=4;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		 System.out.println("Sorted list is :");
		   		   for(i=0;i<=3;i++){
					   System.out.println("{"+arr[i]+"}");
				   
				   } System.out.print(arr[i]);
		}
		
	}
