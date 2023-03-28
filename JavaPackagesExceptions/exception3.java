class exception3 {
    public static void main(String args[]) {
        int a = 10, result;
        try {
            result = a / 0 ;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } finally {
            System.out.println("finally block");
        }
        result = a / 1;
        System.out.println("Result: " + result);
    }
}