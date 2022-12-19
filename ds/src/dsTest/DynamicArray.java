package dsTest;

public class DynamicArray {
	int count;
	int size;
	int arr[];
	public DynamicArray()
	{
		count = 0;
		size=1;
		arr = new int[1];
	}
	public void add(int data)
	{
		if(size==count)
		{
			int temp[] = new int[size*2];
			for(int i=0;i<size;i++)
			{
				temp[i]=arr[i];
			}
			arr = temp;
			size = size*2;
		}
		arr[count] =data;
		count++;
	}

	public void removeAt(int index)
	{
		for(int i= index ;i<=count;i++)
		{
			arr[i] = arr[i+1];
		}
		count--;
	}
	public void remove()
	{
		if(count>0)
		arr[count-1] = 0;
		count--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     DynamicArray da = new DynamicArray();
     da.add(4);da.add(4);
     da.add(2);da.add(5);
     da.add(6);
     da.remove();
     da.removeAt(2);
     
     for(int i:da.arr)
    	 System.out.print(i+" "); System.out.println();
    for(int i=0;i<da.count;i++)
    	System.out.print(da.arr[i]+" ");
	}
}

