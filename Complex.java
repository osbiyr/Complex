package matala1;

public class Complex {
	double a,b;

	// constructor
	public Complex(double a, double b) {
		this.a= a;
		this.b = b;
	}

	// method to calculate a complex number
	public double module() {
		double re=Math.pow(this.a, 2);
		double img =Math.pow(this.b, 2);
		double ans =  Math.sqrt(re+img);
		return Math.abs(ans);
	}

	// method to add 2 complex numbers
	public void add (Complex z) {
		this.a+=z.a; // re +re
		this.b+=z.b; //img +img
	}

	// method to multiply 2 complex numbers
	public void mul(Complex z) {
		this.a= (this.a * z.a) - (this.b * z.b);
		this.b= (this.a * z.b) + (z.a * this.b);
	}

	// method to compare 2 complex numbers
	public int compare(Complex z) {
		if(this.module()<z.module())return -1;   // השני גדול מהראשון
		else if( this.module()==z.module())return 0;  // הראשון שווה לשני
		return 1; 		//else if- השני קטן מהראשון
	}

}