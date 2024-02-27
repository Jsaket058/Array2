class Array2{
	int secondSmallest(int arr[]){
		int s=arr[0];
		int xs=Integer.MAX_VALUE;
		int n=arr.length;
		for(int i=1;i<n;i++){
			if(s>arr[i]){
				xs=s;
				s=arr[i];
			}
			else if(s<arr[i] && xs>arr[i]){
				xs=arr[i];
			}
		}
		return xs;
	}
}
class Run{
	public static void main(String[] args){
		Array2 a=new Array2();
		int arr[]={9,5,47,8,2,3,99,49};
		System.out.println(a.secondSmallest(arr));
	}
}