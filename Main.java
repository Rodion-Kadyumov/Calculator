public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        Integer c = calc.devide.apply(a, b);
        calc.println.accept(c);

/* делить на "0" - нельзя, либо перехватить исключение, либо дописать условие к делению
        try{
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        }
        catch (java.lang.ArithmeticException ex){
            System.out.println("It is not allowed to divide by zero!");
        }
 */
    }
}