package sorting;

public class Insertsort {
	public static void main(String[]args)
	{
		int arr[]= {3,2,4,2,7};
		for(int i=1;i<arr.length;i++)
		{
			int insertvalue = arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j] > insertvalue) 
				{
					int temp = arr[j];
					arr[j]=insertvalue;
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr)
		System.out.print(x+" ");
	}

}
