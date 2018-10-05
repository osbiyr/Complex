package matala1;


public class ObjectSort {

	// method to sort Sortable objects 
	public static void sort(Sortable item) {
		for (int i=1; i <item.size(); i++){   
			int j = i;   
			while (j>0 && item.compare(item.valueAt(j),item.valueAt(j-1) )== -1){     
				int temp = j;
				item.setValue(item.valueAt(j-1), j);
				item.setValue(item.valueAt(temp), j-1);
			}      
		}    
	} 

	// boolean method that checks if Sortable objects are sorted
	public static boolean checkSort(Sortable item) {   
		boolean ans = true;   
		for (int i=1; ans && i< item.size(); i++){    
			if(item.compare(item.valueAt(i),item.valueAt(i-1) )== 1) {
				ans = false;    
			}
		}
		return ans;  
	}

}
