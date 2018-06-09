
public class Main {
	static void printArray(int arr[])
	{
		for(int each:arr)
			System.out.print(each+" ");
		
		System.out.println();
	}

	public static void main(String args[]) {
		
		MergeSort msort = new MergeSort();
		SelectionSort ssort = new SelectionSort();
		InsertionSort isort = new InsertionSort();
		QuickSort qsort = new QuickSort();
		
		long start,end;
				
		for(int n=10000;n<=50000;n=n+10000)
		{
			System.out.print("\nInput Size: "+n);
			int arr[] = new int[n];
			int arr2[] = new int[n];
			int arr3[] = new int[n];
			int arr4[] = new int[n];
			
			for(int i = 0; i < arr.length; i++) {
			    arr[i] = (int)(Math.random()*0+100000000);
			}
			arr2 = arr.clone();
			arr3 = arr.clone();
			arr4 = arr.clone();
			
			start = System.nanoTime();
			isort.Sort(arr);
			end = System.nanoTime();			
			System.out.print(" | Insertion Sort - "+((end-start)));
			
			start = System.nanoTime();
			ssort.Sort(arr2);
			end = System.nanoTime();
			System.out.print(" | Selection Sort - "+((end-start)));
			
			start = System.nanoTime();
			msort.Sort(arr3, 0, arr3.length-1);
			end = System.nanoTime();			
			System.out.print(" | Merge Sort - "+((end-start)));
			
			start = System.nanoTime();
			qsort.Sort(arr4, 0, arr4.length-1);
			end = System.nanoTime();			
			System.out.print(" | Quick Sort - "+((end-start)));
			
			
		}
		
	}
}
