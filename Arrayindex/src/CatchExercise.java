public class CatchExercise {

    public static void main(String[] args) {
        try {
          
        	
        	int[] a = new int[5];
            
        	a[5] = 30 / 5;  
        	
        	
            System.out.println("This line will not be executed if an exception occurs above.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch blocks.");
    }
}
