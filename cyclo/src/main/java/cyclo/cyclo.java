package cyclo;
public class cyclo {

    public static void main(String[] args) {
        // Test the determineTriangle method with example values
        String result = determineTriangle(0, 0, 0);
        System.out.println("Result: 1" + result);
    }

    // Method to determine if the triangle is valid or invalid
    public static String determineTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "invalid";
        } else if(a==b || a==c || b==c) {
        	return "isoceles";
        }
     else if(a+b<=c || a+c<=b || b+c<=a) {
    	return "isoceles";
    }
        else {
            return "scalene";
        }
    }
}
