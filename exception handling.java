public class Main { 
    public static void main(String[] args) {
        
        try {           
            int result = divide(10, 0);
            System.out.println("Result: " + result);       
            }
            catch (ArithmeticException e) {
                
            System.err.println("Error: Division by zero");     
            }
    }
    public static int divide(int numerator, int denominator) {   
        return numerator / denominator;
    }
    
}