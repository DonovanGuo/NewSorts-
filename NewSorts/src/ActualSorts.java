import java.util.Arrays;

public class ActualSorts 
{
	public static String[] mergeSort(String[]list1)
	{
		if(list1.length == 1)
		{
			return list1;
		}
		int x = list1.length;
		if(!((x % 2)==0))// if the lengths of the string is odd 
		{
			int rightl = (x+1)/2;
			int leftl = list1.length - (x+1)/2;
			String[] left = Arrays.copyOfRange(list1,0,leftl);
			String[] right = Arrays.copyOfRange(list1,leftl,rightl);
			return(ArrayMethods2.merge(mergeSort(left), mergeSort(right)));
		}
		else
		{
			int rightl = x/2;
			int leftl = x/2;
			String[] left = Arrays.copyOfRange(list1,0,leftl);
			String[] right = Arrays.copyOfRange(list1,leftl,rightl);
			return(ArrayMethods2.merge(mergeSort(left), mergeSort(right)));
		}
		
		
	}
	public static int partition(int[] list, int front, int back)
	{
		int pivot = list[front];
		int holdpos = back - 1;
		for (int i = holdpos; i >= 1; i--)
		{
			if (list[i] > pivot)
			{
				if (i != holdpos)
				{
					int sub = list[holdpos];
					list[holdpos] = list[i];
					list[i] = sub;
				}
				holdpos--;
			}
		}
		
		list[front] = list[holdpos];
		list[holdpos] = pivot;
		return holdpos;
	}
	
	public static void quickSort(int[] list, int front, int back)
	{
		if (back > front)
		{
			int pivdex = partition(list, front, back);
			quickSort(list, front, pivdex);
			quickSort(list, pivdex + 1, back);
		}
	}
}
