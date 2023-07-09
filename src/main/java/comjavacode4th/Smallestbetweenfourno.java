package comjavacode4th;

public class Smallestbetweenfourno {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1.2;
		double c = 1.3;
		double d = 1.4;
		if (a<b && a<c ) {
			System.out.println("a is the smallest :" + a);
			
		}else if (b<a && b>c) {
			System.out.println("b is the smallest :" + b);
		}else if (c<d && c>d) {
			System.out.println("c is the smallest :" + c);
		}else if (d<a && d<c) {
			System.out.println("d is the smallest :" + d);
		}

	}

}
