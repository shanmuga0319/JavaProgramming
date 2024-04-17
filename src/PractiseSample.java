public class PractiseSample {

    public int arithmeticCalc(int firstNumber, int secondNumber) {
        int additionRes = firstNumber + secondNumber;
        System.out.println("Addition:" + additionRes);

        int subRes = firstNumber - secondNumber;
        System.out.println("Subtraction:" + subRes);

        int mulRes = firstNumber * secondNumber;
        System.out.println("Multiplication:" + mulRes);

        int divRes = firstNumber / secondNumber;
        System.out.println("Division" + divRes);

        return additionRes;
    }

    public static void main(String[] args) {
        PractiseSample practiseSample = new PractiseSample();
        int additionRes = practiseSample.arithmeticCalc(50, 10);

        if (additionRes % 2 == 0) {
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }

}
