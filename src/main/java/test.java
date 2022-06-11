public class test {
    public static void main(String[] args) {

        testCalcAdd();
    }

    /**
     * tak wiem, prymitywne, ale od tego zaczyna sie w kursie, a postyanowiłem przerobić cały od deski do deski - dokładnie i starannie
     */
    private static void testCalcAdd() {

        Calculator calc = new Calculator();

        int result = Calculator.sum(2,2);

        if(result != 4) {
            throw  new IllegalStateException("zły wynik ");
        } else {
            System.out.println("ok ok");
        }

    }
}
