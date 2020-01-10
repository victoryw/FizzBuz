package fizz.buz;

public class FizzBuz {
    public String count(int number) {
        String result;

        final boolean isExactDivisionByThree = number % 3 == 0;
        final boolean isExactDivisionByFive = number % 5 == 0;

        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";

        if (isExactDivisionByFive && isExactDivisionByThree) {
            result = String.join("", Fizz, Buzz);
        } else if (isExactDivisionByThree) {
            result = Fizz;
        } else {
            if (isExactDivisionByFive) {
                result = Buzz;
            } else if (number % 7 == 0) {
                result = Whizz;
            } else {
                result = String.valueOf(number);
            }
        }
        return result;
    }
}
