
public class ArrayMethods2//Donovan Guo
{
	public static String[] merge(String[]list1,String[]list2) //Pre-condition both lists are sorted in alphabetical order already.
	{
		int x = 0;//index for list1 
		int y = 0; //index for list2
		String[]Combined = new String[list1.length + list2.length];//runs the code for the entire duration of the new string 
		for(int i = 0; i < Combined.length; i++)//runs the code for the entire duration of the new string
		{
			
			if ((y < list2.length) && (x < list1.length))// prevents out of index comparison
			{
				if(list1[x].compareTo(list2[y]) > 0)
					{
					Combined[i]= list2[y];//sets index i of "Combined" to the value of list2[y]
					y++;// move an index forward 
					}
				else if(list1[x].compareTo(list2[y]) <= 0)
				{
					Combined[i]= list1[x];//vice versa of the above
					x++;// moves list1 an index forward
				}
			}
			else // adds the rest of the other unfinished array to the end of the combination array 
				{
					while(x < list1.length) // Incase list2 has been finished 
					{
						Combined[i] = list1[x];
						i++;
						x++;
					}
					while( y < list2.length)// Incase list2 has been finished 
					{
						Combined[i] = list2[y];
						i++;
						y++;
					}
						
				}
			}
		
		return Combined;
	}
	
	public static int partition(int[]list)
	{
		int pivotdex = 0;
		int checkdex = 0;
		
	}
	public static void swapInt ( int[]arr, int mama, int mio )
	{
		int store = arr[mama];
		arr[mama]= arr[mio];
		store = arr[mio];
	}

}
