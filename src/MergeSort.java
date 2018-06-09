
public class MergeSort {
	
	void Merge(int array[], int L,int R,int M)
	{
		int S1 = M-L+1;
		int S2 = R-M;
		
		int LA[] = new int [S1];
		int RA[] = new int [S2];
		
		for(int i=0;i<S1;i++)
			LA[i]=array[L+i];
		
		for(int i=0;i<S2;i++)
			RA[i]=array[M+1+i];

		//
		//step++;
		//System.out.println("\nStep"+step+"-");
		//System.out.print("Left - ");printArray(LA);
		//System.out.print("Right - ");printArray(RA);
		
		//int size=S1+S2;
		int i=0,j=0;
		int k=L;
		while(i<S1 && j<S2)
		{
			if(LA[i]<=RA[j])
			{
				array[k]=LA[i];
				i++;
			}else {
				array[k]=RA[j];
				j++;
			}
			k++;
		}
		
		while(i<S1) {
			array[k]=LA[i];
			i++;k++;
		}
		
		while(j<S2)
		{
			array[k]=RA[j];
			j++;k++;
		}
		
	}
	
	void Sort(int array[], int L, int R)
	{
		if(L<R)
		{
			int M = (R+L)/2;
			
			Sort(array,L,M);
			Sort(array,M+1,R);
			
			//System.out.println("\nCalling Merge -");
			//printArray(array);
			Merge(array,L,R,M);
		}
	}
	
	
}
