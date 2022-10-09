class threearray{
	public static void main(String args[]){
		int arr[][]={
			{1,2,3},{2,3,4},{6,7,8}
		};
		for(int r=0;r<3;r++){
			for(int c=0; c<3;c++){
				System.out.print(arr[r][c]);
			}
			System.out.println();
		}
	}
}