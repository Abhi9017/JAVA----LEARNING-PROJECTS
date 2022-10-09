class bsearch{
	public static void main(String args[]){
		int low =0;
		int high = 9;
		int mid = (low+high)/2;
		int arr[]={0,1,2,3,4,5,6,7,8,9};
		int key=2;
		if(arr[mid] == key){
			System.out.print("index at "  +mid+"--"+key );
		}
		else if(arr[mid] < key){
			 low = mid +1;
			 			System.out.print("index at200 " +low);
 
			
		}
		else{
			high=mid -1;
						System.out.print("index at 300" + high);

		}
	}
}