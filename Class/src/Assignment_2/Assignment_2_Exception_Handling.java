/*
 * Assignment_2.1 
 * Try_catch
 * 
 */
package Assignment_2;

/**
 * @author gourab Reg: 2017831004
 */
public class Assignment_2_Exception_Handling {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result is :" + result);

            int results = x + y;
            if (results < 100) {
                throw new NullPointerException();
            }

        } catch (ArithmeticException e) {
            System.out.println("Exception is:" + e);
        }
         catch (NullPointerException e2) {
            System.out.println("Exception :" + e2);
        
        try {

            String a = "efdf";
            System.out.println(a.charAt(9));

        } catch (NullPointerException p) {
            System.out.println("Exception :" + p);
        } finally {
            System.out.println("Program Ends here.");
        }

    }

}
}
