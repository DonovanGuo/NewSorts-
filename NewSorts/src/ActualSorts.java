
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
			
		}
		else if ((x % 2)==0)
		{
			int rightl = x/2;
			int leftl = x/2;
		}
		
}
