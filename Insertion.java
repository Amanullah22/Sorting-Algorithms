
public class Insertion {
	
	public static void Insertion_Basic(long[] numbers1)
	{
		long var;
		int j;
		for(int i=1;i<numbers1.length;i++)
		{
			var=numbers1[i];
			j=i-1;
			while(j>-1 && numbers1[j]>var){
				numbers1[j+1]=numbers1[j];
				j--;
	    }
	    numbers1[j+1]=var;
		}
	}

}
