package matala1;

public class SortComplex implements Sortable {
	private Complex [] cArr;

	// Constructor
	public SortComplex(Complex[] c ) {
		cArr= c;	
	}

	// method to compare 2 complex numbers
	@Override
	public int compare(Object left, Object right) {
		return ((Complex) left).compare((Complex)right);
	}

	// method to return the value at the given position
	@Override
	public Object valueAt(int position) {
		return cArr[position];
	}

	// method to set value at a given position
	@Override
	public void setValue(Object value, int position) {
		this.cArr[position] = (Complex)value;
	}

	// method to return the size of the complex Arr
	@Override
	public int size() {
		return cArr.length;
	}

}
