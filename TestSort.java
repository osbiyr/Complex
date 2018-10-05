package matala1;


public class TestSort {

	public static void main(String[] args) {
		Complex []c = new Complex[10];   
		for(int i=0; i<c.length; i++){    
			double a = Math.random()*c.length;    
			double b = Math.random()*c.length;    
			c[i]= new Complex(a,b);   
		}   
		SortComplex sc = new SortComplex(c);  
		ObjectSort.sort(sc);   
		System.out.println("is sorted: "+ObjectSort.checkSort(sc));   
		for(int i=0; i<c.length; i++)
		{
			System.out.println(((Complex)sc.valueAt(i)).module());   
		}
		System.out.println();  
	}

	// boolean method that checks if Arr is sorted
	public static boolean checkSort(int[] arr){   
		boolean ans = true;   
		for (int i=0; ans&&i< arr.length-1; i++){    
			if(arr[i] > arr[i+1])
			{     
				ans = false;    
			}
		}
		return ans;  
	} 

	// method to sort an Arr 
	public static void insertionSort1(int[] arr){   
		for (int i=1; i <arr.length; i++){    
			int j = i;    
			while (j>0 && arr[j]<arr[j-1]){     
				swap(arr, j, j-1);     
				j = j-1;    
			}      
		}    
	}

	// method to swap 2 objects in Arr
	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	} 
}
