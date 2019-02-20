
public class Selection {
	
	static boolean swapped;
	
	public static void Selection_basic(long[] numbers1)
	{
		int loc,j;
		long temp;
		for(int i=0;i<(numbers1.length-1);i++)
		{
			loc=i;
			for(j=i+1;j<numbers1.length;j++){
				if(numbers1[loc]>numbers1[j]){
					loc = j;
				}
			}
			if(loc!=i)
			{
			temp = numbers1[i];
			numbers1[i] = numbers1[loc];
			numbers1[loc]=temp;
			}
	    
		}

	}
	
	public static void Selection_MinMax(long[] numbers1)
	{
		int loc,j,i;
		long temp;
		loc=numbers1.length;
		swapped = true;
		for (i=0; i<loc; i++){
		  for (j=i+1; j<loc; j++){
			  swapped = false;
		    long v = numbers1[j];
		    if (v < numbers1[i]){
		    	temp = numbers1[i];
		    	numbers1[i] = numbers1[j];
		    	numbers1[j] = temp;
		    	swapped = true;
		    }
		  }
	   }
	}

}
