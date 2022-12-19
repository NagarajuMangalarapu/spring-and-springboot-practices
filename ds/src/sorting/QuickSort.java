package sorting;

public class QuickSort 
{
	public static void quicksort(int[]arr, int low,int high)
	{
		if(low < high)
		{
			int pi = partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
		}
	}
	public static int partition(int []arr , int low , int high)
	{
		int pivot = arr[high];
		int i= low-1;
		for(int j= low ; j<high ; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}
	public static void main(String[] args) 
	{ 
		int arr[]= {10,12,9,4,1,23,13};
		//QuickSort qs = new QuickSort();
		QuickSort.quicksort(arr, 0, arr.length-1);
		for(int x : arr)
			System.out.print(x+" ");
	
	}
 
}
