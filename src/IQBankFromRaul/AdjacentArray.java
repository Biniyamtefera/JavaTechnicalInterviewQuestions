package IQBankFromRaul;

public class AdjacentArray {

	public static void main(String[] args) {

		//Max difference between any adjacent index in array
		int[] a = {1,4,8,15,17}; //3 4,7,2
		System.out.println("maxDiff(a) = " + maxDiff(a));
		int diff =0;
		for(int i=0;i<a.length-1;i++)
		{
			  if(a[i+1] - a[i]>diff)
			  {
				  diff=a[i+1] - a[i];
			  }
		}
		
		System.out.println(diff);

		
	}

	public static int maxDiff(int[] arr) {
		int maxDiff = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]-arr[i] > maxDiff) {
				maxDiff = arr[i+1]-arr[i];
			}
		}
    return maxDiff;
	}

}
