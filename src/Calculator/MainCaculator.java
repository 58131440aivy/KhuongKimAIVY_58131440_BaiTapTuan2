
package Calculator;

public class MainCaculator {

 
    public static void main(String[] args) {
        ICalculator calculator;
        calculator = new Calculator();
        System.out.println("7 * 8 = " + calculator.Nhan(7, 8) );
    }
    
}
