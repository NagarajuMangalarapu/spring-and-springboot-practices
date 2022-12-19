package sorting;

public class SelectionSort 
{
	public static void main(String[] args) {
		int arr[] = {32,1,2,5,3,21,3,3};
		for(int i=0;i<arr.length-1;i++)
		{
			int small = i;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[small])
				{
					small =j;
					//System.out.println(small);
				}
			}
			//System.out.println(small);
			int temp = arr[small];
			arr[small]=arr[i];
			arr[i]=temp;
		}
		for(int x:arr)
		System.out.print(x+" ");
	}

}
