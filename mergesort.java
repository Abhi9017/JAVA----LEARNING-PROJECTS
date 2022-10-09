public class mergesort{
		public static void main(String args[]){
			int arr[]={9,8,7,6,5,4};
		int lb=0;
		int ub=5;
		int mid=(ub+lb)/2;
		int i,j,k;
		i=lb;
		j=mid+1;
		k=lb;
		int mid=(ub+lb)/2;
		int brr[]=new int[6];
		

    static void mergesorting(arr, lb, ub){
         
		  mergesorting(arr, lb, mid);
		 mergesorting(arr,mid+1,ub);
		 merge(brr,lb,mid,ub);
	}
 static void   merge(int[] arr,0,2,5){
	   
  	while(i<=mid && j<=ub){
			if(arr[i]>arr[j]){
				brr[k]=arr[j];
				i++;
				k++;
			}else{
				brr[k]=arr[i];
				k++;
				j++;
			}
		}
		if(i>mid){
			while(j<=ub){
			brr[k]=arr[j];
			j++;
             k++;			
			}}else{
				while(j>=ub){
			brr[k]=arr[i];
			i++;
			k++;
			}}
		
		
	}

	
		
	 
		for(k=0;k<=5;k++)
		{
			System.out.println(brr[k]);
		}	
		
		
	}
}
	
	
	