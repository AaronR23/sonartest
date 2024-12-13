package cyclo;

public class cyclo {
	public static String determineTriangle(int a, int b, int c) {
	    if (a <= 0 || b <= 0 || c <= 0) {
	        return "Invalid";
	    }
	    
	    ///////////////////
	    
	    if (a + b <= c || a + c <= b || b + c <= a) {
	        return "Not a triangle";
	    }
	    
	    //////////////////////////////
	    
	    if (a == b && b == c) {
	        return "Equilateral";
	    } else if (a == b || a == c || b == c) {
	        return "Isosceles";
	    } else {
	        return "Scalene";
	    }	    
	}
}



